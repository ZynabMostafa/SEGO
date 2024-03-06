package com.example.sego.data.Repository

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.remote.ApiService
import com.example.sego.domain.model.LoginResponse
import com.example.sego.domain.reposatory.Repository
import com.example.sego.utils.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class AuthenticationRepository @Inject constructor(
    private val apiService: ApiService
): Repository {
    override suspend fun login(userRequest: UserRequest): Resource<LoginResponse> {
     return try {
         val response = apiService.login(userRequest)
         Resource.Success(LoginResponse(user = response.body()!!.user , status = response.body()!!.status))
     }catch (e:IOException){
         Resource.Error("IO Exception")
     }catch (e:HttpException){
         Resource.Error("HTTP Exception")
     }
    }


}