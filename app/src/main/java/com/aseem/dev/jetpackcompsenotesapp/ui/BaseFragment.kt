package com.aseem.dev.jetpackcompsenotesapp.ui

import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment(layoutId: Int) : Fragment(layoutId) {
    fun showSnackBar(
        view: View,
        text: String
    ) {
        Snackbar.make(
            view,
            text,
            Snackbar.LENGTH_LONG
        ).show()
    }
}