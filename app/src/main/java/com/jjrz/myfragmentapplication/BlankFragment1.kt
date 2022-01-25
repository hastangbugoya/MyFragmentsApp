package com.jjrz.myfragmentapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jjrz.myfragmentapplication.databinding.BlankFragment1FragmentBinding

class BlankFragment1 : Fragment() {

    companion object {
        fun newInstance() = BlankFragment1()
    }

    private lateinit var viewModel: BlankFragment1ViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blank_fragment1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BlankFragment1ViewModel::class.java)
        val binding = BlankFragment1FragmentBinding.inflate(LayoutInflater.from(requireContext()))
        binding.buttonClickMe.setOnClickListener() {
            viewModel.myString.value = binding.textInput.text.toString()
        }
    }

}