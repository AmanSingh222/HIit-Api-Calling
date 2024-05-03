package com.aman.apicallingusinghilltandretrofiit.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aman.apicallingusinghilltandretrofiit.Models.resInformation
import com.aman.apicallingusinghilltandretrofiit.Repository.Repository_resName
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repositoryResname: Repository_resName) : ViewModel() {

    val resName = MutableLiveData<List<resInformation>>()
    val res:LiveData<List<resInformation>>
        get() = resName

    init {
        getAllInfo()
    }

    private fun getAllInfo() {


        TODO("Not yet implemented")
    }
}