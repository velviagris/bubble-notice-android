package com.velviagris.bubblesplit

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class TrampolineActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val targetPackage = intent.getStringExtra("EXTRA_TARGET_PACKAGE")
        if (targetPackage != null) {
            val launchIntent = packageManager.getLaunchIntentForPackage(targetPackage)?.apply {
                addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT or Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            if (launchIntent != null) {
                try {
                    startActivity(launchIntent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        finish()
    }
}
