package com.mosso.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class FragmentMain : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        transactionBtn.setOnClickListener {
            findNavController().navigate(R.id.goToTransaction)
        }

        chooseRecipientBtn.setOnClickListener {
            findNavController().navigate(R.id.goToChooseRecipient)
        }

        balanceBtn.setOnClickListener {
            findNavController().navigate(R.id.goToBalance)
        }
    }
}
