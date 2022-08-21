package com.example.fragmentstest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentstest.databinding.FragmentEdittextBinding
import com.example.fragmentstest.databinding.FragmentViewBinding

class ViewFragment : Fragment(R.layout.fragment_view) {

    private var _binding: FragmentViewBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.tvViewText.text =
            "Name: ${uniVar.name} \nPhone Number: ${uniVar.phone} \nEmail: ${uniVar.email} \nCity: ${uniVar.city} "

        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}