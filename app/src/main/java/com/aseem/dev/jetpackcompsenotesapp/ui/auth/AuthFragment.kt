package com.aseem.dev.jetpackcompsenotesapp.ui.auth

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.aseem.dev.jetpackcompsenotesapp.R
import com.aseem.dev.jetpackcompsenotesapp.ui.BaseFragment
import com.aseem.dev.jetpackcompsenotesapp.ui.notes.NotesFragmentDirections

class AuthFragment: BaseFragment(R.layout.fragment_auth) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            findNavController().navigate(AuthFragmentDirections.actionAuthFragmentToNotesFragment())
        }
    }
}