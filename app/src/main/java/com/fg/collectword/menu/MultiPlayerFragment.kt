package com.fg.collectword.menu

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragment_find_game_menu.*
import kotlinx.android.synthetic.main.fragment_main_menu.*

class MultiPlayerFragment() : Fragment(R.layout.fragment_find_game_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBtn()
    }

    private fun setupBtn(){
        btnFindOnlineGame.setOnClickListener { run {
            findNavController().navigate(R.id.matchMakingFragment)
        }}
        btnInviteFriend.setOnClickListener {   run {
            findNavController().navigate(R.id.inviteCodeFragment)
        }}
    }
}