package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androidtrivia.R
import com.example.androidtrivia.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.playButton.setOnClickListener {view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }



        return binding.root
    }
}