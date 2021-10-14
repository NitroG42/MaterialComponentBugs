package com.nitrog42.materialcomponentbugs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_bug_scrim.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Each time the appbar is expanded or collapse without animation, the scrim animate.
 * The issue comes if you want the app bar to be collapse by default using app:expanded="false" which still animate the scrim on the screen.
 */
class ScrimBugActivity : AppCompatActivity() {
    private var expanded = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bug_scrim)
        setSupportActionBar(toolbar)

        lifecycleScope.launch {
            while (true) {
                expanded = !expanded
                delay(1000)
                // Should toggle expand state of the appbar, without animation
                // Bug : the scrim is still animated
                app_bar.setExpanded(expanded, false)
                // Bug : this toggle the scrim but without animation
                toolbar_layout.setScrimsShown(expanded, false)
            }
        }
    }

}
