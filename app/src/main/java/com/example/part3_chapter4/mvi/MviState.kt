package com.example.part3_chapter4.mvi

import com.example.part3_chapter4.mvi.model.Image
import io.reactivex.Single

sealed class MviState {
    object Idle : MviState()
    object Loading : MviState()

    data class LoadedImage(val image: Single<Image>, val count:Int) : MviState()
}