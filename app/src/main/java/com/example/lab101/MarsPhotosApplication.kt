package com.example.lab101

import android.app.Application
import com.example.lab101.ui.theme.data.AppContainer
import com.example.lab101.ui.theme.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
