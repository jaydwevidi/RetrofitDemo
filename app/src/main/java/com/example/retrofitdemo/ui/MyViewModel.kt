package com.example.retrofitdemo.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitdemo.model.Post
import com.example.retrofitdemo.repository.MyRepository
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {

    var mPost = MutableLiveData<Post>()

    fun getPost(){
        viewModelScope.launch {
            mPost.value = MyRepository.getPost()
            Log.d("TAG", "getPost: ${mPost.value}")
        }
    }
}