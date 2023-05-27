package com.example.part3_chapter4.mvp.repository

interface ImageRepository {

    fun getRandomImage (callBack: CallBack)

    interface CallBack {
        fun loadImage(url: String, color:String)
    }
}