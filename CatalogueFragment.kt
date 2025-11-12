package com.example.bookloaner

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bookloaner.databinding.FragmentCatalogueBinding

class CatalogueFragment : Fragment(R.layout.fragment_catalogue) {
    private var _binding: FragmentCatalogueBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCatalogueBinding.bind(view)

        binding.btnViewDetail.setOnClickListener {
            findNavController().navigate(R.id.action_catalogueFragment_to_detailFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
