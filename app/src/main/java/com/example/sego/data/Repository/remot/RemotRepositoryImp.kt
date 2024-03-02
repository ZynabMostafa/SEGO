package com.example.sego.data.Repository.remot

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.dto.LoginResponseDto
import com.example.sego.data.remot.ApiService
import com.example.sego.domain.reposatory.remot.RemoteRepository
import com.example.sego.utils.Resource
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RemoteRepositoryImp @Inject constructor(
    private val apiService: ApiService
):RemoteRepository {

    override suspend fun login(userRequest: UserRequest): Resource<LoginResponseDto, String> {
        return try {
            Resource.Success(apiService.login(userRequest))
        }catch (e: HttpException) {
            Resource.Error(e.localizedMessage ?: "An unexpected error occurred")
        } catch (e: IOException) {
            Resource.Error("Couldn't reach server. Check your internet connection.")
        }
    }

}