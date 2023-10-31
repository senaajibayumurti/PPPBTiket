package com.example.pppbtiket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.pppbtiket.databinding.FragmentOrderTicketBinding

class OrderTicketFragment : Fragment() {
    private lateinit var binding: FragmentOrderTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderTicketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            val typeOfTicket = resources.getStringArray(R.array.type_of_ticket)
            val adapterTypeOfTicket = ArrayAdapter<String>(requireContext(), R.layout.spinner_item, typeOfTicket)
            spinnerTicketType.adapter = adapterTypeOfTicket

            btnBuyTicket.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}