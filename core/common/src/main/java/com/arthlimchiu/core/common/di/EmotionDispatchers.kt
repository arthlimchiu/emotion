package com.arthlimchiu.core.common.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val dispatcher: EmotionDispatchers)

enum class EmotionDispatchers {
    Default,
    IO
}