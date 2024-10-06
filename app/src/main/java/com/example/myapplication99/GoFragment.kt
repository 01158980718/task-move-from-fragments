package com.example.myapplication99

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.myapplication99.databinding.FragmentGoBinding

class GoFragment : Fragment() {
    lateinit var binding: FragmentGoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGoBinding.inflate(inflater, container, false)

        // Set the onClickListener before returning the view
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_goFragment_to_backFragment, bundleOf(
                "name" to "Rahma"
            ))
        }

        return binding.root
    }
}
