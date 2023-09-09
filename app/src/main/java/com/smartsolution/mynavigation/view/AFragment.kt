package com.smartsolution.mynavigation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController
import com.smartsolution.mynavigation.R

class AFragment : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext = requireView().findViewById<Button>(R.id.btn_next)
        val btnBack = requireView().findViewById<Button>(R.id.btn_back)
        val textScreen = requireView().findViewById<TextView>(R.id.tv_screen_a)
        textScreen.text = "Pantalla A"
        btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_BFragment)
        }
        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_CFragment)
        }

    }
}