package com.miempresa.tecfoodandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.miempresa.tecfoodandroid.Fragmentos.Fragment
import com.miempresa.tecfoodandroid.Fragmentos.Fragment2
import com.miempresa.tecfoodandroid.Menus.Menus
import com.miempresa.tecfoodandroid.Menus.menus_adapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment()
        supportFragmentManager.beginTransaction().replace(R.id.cambiar, fragment1).commit()
        val fragment2 = Fragment2()

        irPrimerFrag.setOnClickListener(){
            supportFragmentManager.beginTransaction().replace(R.id.cambiar, fragment1).commit()
        }

        irPrimerFrag2.setOnClickListener(){
            supportFragmentManager.beginTransaction().replace(R.id.cambiar, fragment2).commit()
        }
    }


}