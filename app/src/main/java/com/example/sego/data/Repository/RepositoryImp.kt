package com.example.sego.data.Repository

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.remot.ApiService
import com.example.sego.domain.model.LoginResponse
import com.example.sego.domain.reposatory.Repository
import com.example.sego.utils.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RemoteRepositoryImp @Inject constructor(
    private val apiService: ApiService
): Repository {
    override suspend fun login(userRequest: UserRequest): Resource<LoginResponse> {
     return try {
         Resource.Success(LoginResponse(apiService.login(userRequest).body()!!.user))
     }catch (e:IOException){
         Resource.Error("")
     }catch (e:HttpException){
         Resource.Error("")
     }
    }


}