package com.miempresa.tecfoodandroid.Menus

import android.support.v7.view.menu.ActionMenuItemView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.TextureView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.miempresa.tecfoodandroid.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_menu.view.*


class menus_adapter(val menus:ArrayList<Menus>):RecyclerView.Adapter<menus_adapter.viewHolder>(){

    class viewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val txtTitulo: TextView = itemView.findViewById(R.id.t1)
        val txtRestaurante: TextView = itemView.findViewById(R.id.te1)
        val txtPrecio: TextView = itemView.findViewById(R.id.precio)
        val img_del:ImageView = itemView.findViewById(R.id.img_delivery)
        val img_plato:ImageView = itemView.findViewById(R.id.img_plato)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_menu,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: menus_adapter.viewHolder, position: Int) {
        holder.txtTitulo.text = menus[position].nombre
        holder.txtRestaurante.text = menus[position].restaurant
        holder.txtPrecio.text = menus[position].precio.toString()
        Picasso.get().load(menus[position].img_delivery).error(R.drawable.ic_launcher_background).into(holder.img_del)
        Picasso.get().load(menus[position].img_plato).error(R.drawable.ic_launcher_background).into(holder.img_plato)

    }

    override fun getItemCount() = menus.size

}