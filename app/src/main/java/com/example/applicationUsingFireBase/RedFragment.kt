package com.example.applicationUsingFireBase

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.applicationUsingFireBase.databinding.FragmentRedBinding

class RedFragment : Fragment() {
    private lateinit var binding: FragmentRedBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRedBinding.inflate(inflater, container, false)
        return binding.root
    }




}