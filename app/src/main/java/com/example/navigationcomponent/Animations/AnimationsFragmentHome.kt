package com.example.navigationcomponent.Animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_animations_home.view.*



class AnimationsFragmentHome : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_animations_home, container, false)

        view.navToSecound_btn.setOnClickListener {
           findNavController().navigate(R.id.action_animationsFragmentHome_to_animationsFragment1)
        }

        view.navToFirst_btn.setOnClickListener {
            findNavController().navigate(R.id.action_animationsFragmentHome_to_animationsFragment2)
        }



        return  view
    }


}