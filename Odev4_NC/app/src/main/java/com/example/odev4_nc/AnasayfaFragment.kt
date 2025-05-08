package com.example.odev4_nc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4_nc.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    //önce module app dosyasında viewBinding eklenmeli
   private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.buttonGitA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.AnasayfatoGitA)

        }
        return binding.root
    }

    }
