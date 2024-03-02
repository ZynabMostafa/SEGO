package com.example.sego.domain.use_case.remot

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.dto.loginResponseDto
import com.example.sego.domain.reposatory.remot.RemoteRepository
import com.example.sego.utils.Resource
import retrofit2.Response
import javax.inject.Inject

class LoginUseCase @Inject constructor(
   private val remoteRepository: RemoteRepository
) {
    suspend operator fun invoke(
        userRequest: UserRequest
    ):Resource<loginResponseDto , String>{
        return remoteRepository.login(userRequest)
     }

}