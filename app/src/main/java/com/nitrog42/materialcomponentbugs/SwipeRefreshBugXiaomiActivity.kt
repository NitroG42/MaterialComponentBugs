package com.nitrog42.materialcomponentbugs

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_swiperefreshbugxiaomi.*

/**
 * Each time the appbar is expanded or collapse without animation, the scrim animate.
 * The issue comes if you want the app bar to be collapse by default using app:expanded="false" which still animate the scrim on the screen.
 */
class ExitUntilCollapsedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swiperefreshbugxiaomi)

        swipeRefreshLayout.setOnRefreshListener {
            swipeRefreshLayout.isRefreshing = false
        }
    }

}


class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view)