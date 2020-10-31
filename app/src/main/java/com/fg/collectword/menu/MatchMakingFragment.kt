package com.fg.collectword.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragment_find_game.*
import kotlinx.android.synthetic.main.fragmet_invite.*

class MatchMakingFragment : Fragment(R.layout.fragment_find_game) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBtn()
    }

    private fun setupBtn(){
        scrollView.setOnClickListener { run {
            findNavController().navigate(R.id.gameFragment)
        }}
    }
}