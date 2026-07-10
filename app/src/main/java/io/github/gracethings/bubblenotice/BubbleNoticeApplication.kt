package io.github.gracethings.bubblenotice

import android.app.Application
import io.github.gracethings.bubblenotice.util.AppLogger

class BubbleNoticeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppLogger.init(this)
        AppLogger.i("BubbleNoticeApplication", "Application started, logger initialized.")
    }
}
