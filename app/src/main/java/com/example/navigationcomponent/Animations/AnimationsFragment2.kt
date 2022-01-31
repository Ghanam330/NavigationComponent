package com.example.navigationcomponent.Animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_animations1.view.*
import kotlinx.android.synthetic.main.fragment_animations2.view.*

class AnimationsFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_animations2, container, false)

        view.nav_back.setOnClickListener {
            findNavController().navigate(R.id.action_animationsFragment2_to_animationsFragmentHome)
        }

        return view
    }
}
