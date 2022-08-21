package com.example.fragmentstest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentstest.databinding.FragmentEdittextBinding
import com.example.fragmentstest.databinding.FragmentViewBinding

class EdittextFragment : Fragment(R.layout.fragment_edittext) {
    private var _binding: FragmentEdittextBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEdittextBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}