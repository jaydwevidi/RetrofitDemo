package com.example.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.retrofitdemo.model.Post
import com.example.retrofitdemo.ui.MyViewModel

class MainActivity : AppCompatActivity() {

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myViewModel:MyViewModel by viewModels()
        var x = Post(23,452,"31")
        myViewModel.mPost.observe(this, Observer {
            Log.d("test API-GET", "onCreate: $it")
        })

        myViewModel.getPost()

        Log.d("TAG", "newPost: $x")
    }
}