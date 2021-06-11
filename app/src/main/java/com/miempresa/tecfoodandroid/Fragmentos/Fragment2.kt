package com.miempresa.tecfoodandroid.Fragmentos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miempresa.tecfoodandroid.R
import com.miempresa.tecfoodandroid.Restaurantes.Restaurantes
import com.miempresa.tecfoodandroid.Restaurantes.restaurant_adapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.fragment_2, container, false)
        var rvrestaurantes = view.findViewById<RecyclerView>(R.id.rvrestaurantes)

        var rest_nuevo =
            Restaurantes("Nueva Palomino", "Yanahuara", 5.0,
                "https://images.vexels.com/media/users/3/190869/isolated/preview/68208da69d14a72dd02e4e413866ed6f-edificio-ilustraci-oacute-n-plana-restaurante-by-vexels.png")
        var rest_nuevo1 =
            Restaurantes("Nueva Palomino", "Yanahuara", 5.0,
                "https://images.vexels.com/media/users/3/190869/isolated/preview/68208da69d14a72dd02e4e413866ed6f-edificio-ilustraci-oacute-n-plana-restaurante-by-vexels.png")
        var rest_nuevo2 =
            Restaurantes("Nueva Palomino", "Yanahuara", 5.0,
                "https://images.vexels.com/media/users/3/190869/isolated/preview/68208da69d14a72dd02e4e413866ed6f-edificio-ilustraci-oacute-n-plana-restaurante-by-vexels.png")
        var rest_nuevo3 =
            Restaurantes("Nueva Palomino", "Yanahuara", 5.0,
                "https://images.vexels.com/media/users/3/190869/isolated/preview/68208da69d14a72dd02e4e413866ed6f-edificio-ilustraci-oacute-n-plana-restaurante-by-vexels.png")
        var rest_nuevo4 =
            Restaurantes("Nueva Palomino", "Yanahuara", 5.0,
                "https://images.vexels.com/media/users/3/190869/isolated/preview/68208da69d14a72dd02e4e413866ed6f-edificio-ilustraci-oacute-n-plana-restaurante-by-vexels.png")
        var rest_nuevo5 =
            Restaurantes("Nueva Palomino", "Yanahuara", 5.0,
                "https://images.vexels.com/media/users/3/190869/isolated/preview/68208da69d14a72dd02e4e413866ed6f-edificio-ilustraci-oacute-n-plana-restaurante-by-vexels.png")

        val restaurantes = ArrayList<Restaurantes>()
        restaurantes.add(rest_nuevo)
        restaurantes.add(rest_nuevo1)
        restaurantes.add(rest_nuevo2)
        restaurantes.add(rest_nuevo3)
        restaurantes.add(rest_nuevo4)
        restaurantes.add(rest_nuevo5)

        rvrestaurantes.layoutManager = LinearLayoutManager(activity)
        rvrestaurantes.adapter = restaurant_adapter(restaurantes)
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}