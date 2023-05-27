package com.example.part3_chapter4.mvi.respository

import com.example.part3_chapter4.mvi.model.Image

interface ImageRepository {

    suspend fun getRandomImage(): Image
}