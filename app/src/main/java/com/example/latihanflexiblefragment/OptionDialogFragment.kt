package com.example.latihanflexiblefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OptionDialogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_option_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find views and set listeners
        val btnClose = view.findViewById<Button>(R.id.btn_close)
        val btnChoose = view.findViewById<Button>(R.id.btn_choose)

        btnClose.setOnClickListener {
            parentFragmentManager.popBackStack()        }

        btnChoose.setOnClickListener {
            // Handle choose button click
        }
    }
}
