package com.example.pppbtiket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.pppbtiket.databinding.FragmentOrderTicketBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OrderTicketFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OrderTicketFragment : Fragment() {
    private lateinit var binding: FragmentOrderTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
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