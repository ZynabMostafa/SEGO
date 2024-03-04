package com.example.sego.domain.use_case.remot

import com.example.sego.data.dto.UserRequest
import com.example.sego.domain.model.LoginResponse
import com.example.sego.domain.reposatory.Repository
import com.example.sego.utils.Resource
import javax.inject.Inject

class LoginUseCase @Inject constructor(
   private val remoteRepository: Repository
) {
    suspend operator fun invoke(
        userRequest: UserRequest
    ):Resource<LoginResponse>{
        return remoteRepository.login(userRequest)
     }

}