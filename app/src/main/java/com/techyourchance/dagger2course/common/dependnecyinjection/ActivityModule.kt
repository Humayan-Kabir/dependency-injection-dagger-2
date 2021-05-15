package com.techyourchance.dagger2course.common.dependnecyinjection

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(
        val activity: AppCompatActivity,
        private val appCompositionRoot: AppCompositionRoot
) {

    val screensNavigator by lazy {
        ScreensNavigator(activity)
    }

    @Provides
    fun application() = appCompositionRoot.application

    @Provides
    fun activity() = activity

    @Provides
    fun layoutInflater(activity: AppCompatActivity) = LayoutInflater.from(activity)

    @Provides
    fun fragmentManager() = activity.supportFragmentManager

    @Provides
    fun stackoverflowApi() = appCompositionRoot.stackoverflowApi

}