package com.bavan.protector

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_protector.*

class ProtectorFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_protector, container, false)
    }

    override fun onResume() {
        super.onResume()
        if(background != null) {
            background.visibility = View.GONE
        }
    }

    override fun onPause() {
        super.onPause()
        activateProtection()
    }

    private fun activateProtection(){
        if(background != null) {
            Handler(Looper.getMainLooper()).run {
                background.visibility = View.VISIBLE
            }
        }
    }
}