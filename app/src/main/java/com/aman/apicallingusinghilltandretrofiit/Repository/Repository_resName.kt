package com.aman.apicallingusinghilltandretrofiit.Repository

import com.aman.apicallingusinghilltandretrofiit.Api.Restaurant_namr
import javax.inject.Inject

class Repository_resName @Inject constructor(private val api :Restaurant_namr) {
    suspend fun getResInformation() = api.getResInfo()
}