package com.example.myapplication99

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication99.databinding.FragmentBackBinding

class BackFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBackBinding.inflate(inflater, container, false)
        val args = arguments
        val name = args?.getString("name")
        binding.buttonSecond.text=name
        // Set the onClickListener for the button to navigate back
        binding.buttonSecond.setOnClickListener {
            findNavController().navigateUp()

        }

        return binding.root
    }
}
