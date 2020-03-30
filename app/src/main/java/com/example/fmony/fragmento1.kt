package com.example.fmony


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class fragmento1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val root =  inflater.inflate(R.layout.fragment_fragmento1, container, false)

        val radioGroup: RadioGroup = root.findViewById(R.id.radio_group)

        // Set the radioGroup onCheckedChanged listener.
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton =
                radioGroup.findViewById<View>(checkedId)
            val index = radioGroup.indexOfChild(radioButton)
            val textView: TextView = root.findViewById(R.id.fragment_header)
            when (index) {
                /*com.example.fmony.fragmento1.SI -> textView.setText(R.string.yes_message)
                com.example.fmony.fragmento1.NO -> textView.setText(R.string.no_message)*/
                else -> {
                }
            }
        }

        return root


    }


}
