package com.example.odev4_nc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev4_nc.databinding.FragmentABinding

class AFragment : Fragment() {
   private lateinit var binding:FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentABinding.inflate(inflater,container,false)

        return binding.root
    }



}