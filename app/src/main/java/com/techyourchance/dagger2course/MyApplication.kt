package com.techyourchance.dagger2course

import android.app.Application
import com.techyourchance.dagger2course.common.dependnecyinjection.*

class MyApplication: Application() {

    val appCompositionRoot by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}