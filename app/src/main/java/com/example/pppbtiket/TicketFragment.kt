package com.example.pppbtiket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pppbtiket.databinding.FragmentTicketBinding

class TicketFragment : Fragment() {
    private lateinit var binding: FragmentTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnBuyTicket.setOnClickListener {
                val action = TicketFragmentDirections.actionTicketFragmentToOrderTicketFragment()
                findNavController().navigate(action)
            }
        }
    }
}