package com.miempresa.tecfoodandroid.Fragmentos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miempresa.tecfoodandroid.Menus.Menus
import com.miempresa.tecfoodandroid.Menus.menus_adapter
import com.miempresa.tecfoodandroid.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment : Fragment() {
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
        var view:View = inflater.inflate(R.layout.fragment_, container, false)
        var rvmenus = view.findViewById<RecyclerView>(R.id.rvmenus)
        var menus_nuevo =
            Menus("Lomo Saltado", "La Parcera", 20.00,
                "https://i.pinimg.com/originals/15/0b/e9/150be92048549c934acc6b60270fb7f3.jpg",
                "https://w7.pngwing.com/pngs/814/331/png-transparent-dish-recipe-cuisine-garnish-meal-steak-food-recipe-orange.png")
        var menus_nuevo1 =
            Menus("Lomo Saltado", "La Parcera", 20.00,
                "https://i.pinimg.com/originals/15/0b/e9/150be92048549c934acc6b60270fb7f3.jpg",
                "https://w7.pngwing.com/pngs/814/331/png-transparent-dish-recipe-cuisine-garnish-meal-steak-food-recipe-orange.png")
        var menus_nuevo2 =
            Menus("Lomo Saltado", "La Parcera", 20.00,
                "https://i.pinimg.com/originals/15/0b/e9/150be92048549c934acc6b60270fb7f3.jpg",
                "https://w7.pngwing.com/pngs/814/331/png-transparent-dish-recipe-cuisine-garnish-meal-steak-food-recipe-orange.png")
        var menus_nuevo3 =
            Menus("Lomo Saltado", "La Parcera", 20.00,
                "https://i.pinimg.com/originals/15/0b/e9/150be92048549c934acc6b60270fb7f3.jpg",
                "https://w7.pngwing.com/pngs/814/331/png-transparent-dish-recipe-cuisine-garnish-meal-steak-food-recipe-orange.png")
        var menus_nuevo4 =
            Menus("Lomo Saltado", "La Parcera", 20.00,
                "https://i.pinimg.com/originals/15/0b/e9/150be92048549c934acc6b60270fb7f3.jpg",
                "https://w7.pngwing.com/pngs/814/331/png-transparent-dish-recipe-cuisine-garnish-meal-steak-food-recipe-orange.png")
        var menus_nuevo5 =
            Menus("Lomo Saltado", "La Parcera", 20.00,
                "https://i.pinimg.com/originals/15/0b/e9/150be92048549c934acc6b60270fb7f3.jpg",
                "https://w7.pngwing.com/pngs/814/331/png-transparent-dish-recipe-cuisine-garnish-meal-steak-food-recipe-orange.png")

        val menus = ArrayList<Menus>()
        menus.add(menus_nuevo)
        menus.add(menus_nuevo1)
        menus.add(menus_nuevo2)
        menus.add(menus_nuevo3)
        menus.add(menus_nuevo4)
        menus.add(menus_nuevo5)

        rvmenus.layoutManager = LinearLayoutManager(activity)
        rvmenus.adapter = menus_adapter(menus)

        return view

    }

    /**
    fun initRecycler(datos:ArrayList<Menus>){
        rvmenus.layoutManager = LinearLayoutManager(this)
        rvmenus.adapter = menus_adapter(datos)
    }
    */
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}