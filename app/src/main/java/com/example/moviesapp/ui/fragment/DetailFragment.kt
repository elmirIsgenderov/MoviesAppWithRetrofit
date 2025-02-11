package com.example.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.moviesapp.R
import com.example.moviesapp.databinding.FragmentDetayBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detay, container, false)


        val bundle: DetailFragmentArgs by navArgs()
        var incomingValue = bundle.movie

        binding.movieObject = incomingValue
        binding.detailToolbar = incomingValue.name

        val url = "http://kasimadalan.pe.hu/filmler_yeni/resimler/${incomingValue.picture}"
        Glide.with(this).load(url).override(500, 750).into(binding.imgDetail2)

        return binding.root
    }
}