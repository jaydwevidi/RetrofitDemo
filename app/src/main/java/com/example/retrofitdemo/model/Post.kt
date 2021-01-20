package com.example.retrofitdemo.model

import com.google.gson.annotations.SerializedName


data class Post(
    @SerializedName("userid")
    var userid:Int = 0,
    var id:Int = 0,
    var title: String = "null",
    var body: String = "null"
){
    override fun toString():String = "[$userid,$id,$title,$body]"
}