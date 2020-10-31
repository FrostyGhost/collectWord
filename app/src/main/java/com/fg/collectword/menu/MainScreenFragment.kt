package com.fg.collectword.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragment_main_menu.*


class MainScreenFragment : Fragment(R.layout.fragment_main_menu){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBtn()
    }

    private fun setupBtn(){
        btnStart.setOnClickListener { run {
            findNavController().navigate(R.id.soloGameMenuFragment)
        }}
        btnOnline.setOnClickListener {   run {
            findNavController().navigate(R.id.multiplayerFragment)
        }}
        btnRating.setOnClickListener {   run {
            findNavController().navigate(R.id.ratingFragment)
        }}
        ivSettings.setOnClickListener {   run {
            findNavController().navigate(R.id.action_mainScreenFragment_to_settingsFragment)
        }}
    }
}