package com.fg.collectword.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragment_main_menu.*
import kotlinx.android.synthetic.main.fragment_solo_menu.*

class SoloGameMenuFragment : Fragment(R.layout.fragment_solo_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBtn()
    }

    private fun setupBtn(){
        btnPlaySolo.setOnClickListener { run {
            findNavController().navigate(R.id.gameFragment)
        }}
        btnWithBot.setOnClickListener {   run {
            findNavController().navigate(R.id.gameFragment)
        }}
    }
}