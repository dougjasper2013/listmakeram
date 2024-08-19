package com.trios2024amdj.listmaker.ui.detail.ui.detail

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.trios2024amdj.listmaker.R
import com.trios2024amdj.listmaker.databinding.ListDetailFragmentBinding

class ListDetailFragment : Fragment() {

    companion object {
        fun newInstance() = ListDetailFragment()
    }

    lateinit var binding: ListDetailFragmentBinding
    private lateinit var viewModel: ListDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        viewModel =
            ViewModelProvider(requireActivity()).get(ListDetailViewModel::class.java)
        binding = ListDetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
        // return inflater.inflate(R.layout.list_detail_fragment, container, false)
    }

}