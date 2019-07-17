package com.nitrog42.materialcomponentbugs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bug_scrim.*


/**
 * just scroll from top to bottom and see the status bar color through the screen.
 * The issue comes from app:statusBarForeground="@color/colorAccent" in appbarlayout
 */
class StatusBarScrimBugActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bug_status_bar_scrim)
        setSupportActionBar(toolbar)
    }

}
