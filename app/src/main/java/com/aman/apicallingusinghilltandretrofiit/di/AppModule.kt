package com.aman.apicallingusinghilltandretrofiit.di

import com.aman.apicallingusinghilltandretrofiit.Models.resInformation
import com.aman.apicallingusinghilltandretrofiit.cons.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule  {

    @Singleton
    @Provides
    fun getRetrofitServiceInstance(retrofit: Retrofit):resInformation{
        return retrofit.create(resInformation::class.java)
    }

    @Singleton
    @Provides
    fun getRetrofitInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}