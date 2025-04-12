package com.example.dailyfinance.ui.consumos

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dailyfinance.R

class ConsumosDiariosFragment : Fragment() {

    companion object {
        fun newInstance() = ConsumosDiariosFragment()
    }

    private val viewModel: ConsumosDiariosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_consumos_diarios, container, false)
    }
}