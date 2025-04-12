package com.example.dailyfinance.ui.presupuesto

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dailyfinance.R

class PresupuestoQuincenalFragment : Fragment() {

    companion object {
        fun newInstance() = PresupuestoQuincenalFragment()
    }

    private val viewModel: PresupuestoQuincenalViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_presupuesto_quincenal, container, false)
    }
}