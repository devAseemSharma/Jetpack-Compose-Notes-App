package com.aseem.dev.jetpackcompsenotesapp.ui.notes

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.aseem.dev.jetpackcompsenotesapp.R
import com.aseem.dev.jetpackcompsenotesapp.ui.BaseFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NotesFragment:BaseFragment(R.layout.fragment_notes) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<FloatingActionButton>(R.id.fabAddNote).setOnClickListener {
            findNavController().navigate(NotesFragmentDirections.actionNotesFragmentToAddEditNoteFragment(""))
        }
    }
}