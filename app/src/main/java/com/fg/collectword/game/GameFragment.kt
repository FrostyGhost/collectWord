package com.fg.collectword.game

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fg.collectword.R
import kotlinx.android.synthetic.main.fragmet_invite.*

class GameFragment : Fragment(R.layout.fragment_game) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBtn()
    }

    private fun setupBtn(){

    }
}