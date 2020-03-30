package com.example.fmony

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 */
class fragmento2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       /* Toast.makeText(activity,"Desde el fragmento",Toast.LENGTH_LONG).show()*/
        val view = inflater.inflate(R.layout.fragment_fragmento2, container, false)
        return view
    }

}
