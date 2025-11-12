package com.example.bookloaner

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.bookloaner.databinding.FragmentDetailBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetailBinding.bind(view)

        binding.txtDetail.text = "Aqui aparecem os detalhes do livro."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
