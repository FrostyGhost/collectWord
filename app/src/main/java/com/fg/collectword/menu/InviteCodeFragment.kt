package com.fg.collectword.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragment_find_game_menu.*
import kotlinx.android.synthetic.main.fragmet_invite.*

class InviteCodeFragment : Fragment(R.layout.fragmet_invite) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBtn()
    }

    private fun setupBtn(){
        btnInviteCode.setOnClickListener { run {
            findNavController().navigate(R.id.gameFragment)
        }}
    }
}