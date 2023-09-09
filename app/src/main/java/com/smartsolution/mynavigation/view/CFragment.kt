package com.smartsolution.mynavigation.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController
import com.smartsolution.mynavigation.R

class CFragment : Fragment(R.layout.fragment_c) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext = requireView().findViewById<Button>(R.id.btn_next)
        val btnBack = requireView().findViewById<Button>(R.id.btn_back)
        val textScreen = requireView().findViewById<TextView>(R.id.tv_screen_c)
        textScreen.text = "Pantalla C"
        btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_AFragment)
        }
        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_CFragment_to_BFragment)
        }
    }
}