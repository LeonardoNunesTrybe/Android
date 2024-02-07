package com.example.trybevirtualmenu.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class PratoAdapter(private val pratos: List<Prato>): RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {

    class PratoViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val name: MaterialTextView = view.findViewById(R.id.item_menu_name)
        val image: ShapeableImageView = view.findViewById(R.id.item_menu_image)
    }

    override fun getItemCount(): Int {
        return pratos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_layout, parent, false)
        return PratoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PratoViewHolder, position: Int) {
        holder.name.text = pratos[position].name
        holder.image.setImageResource(pratos[position].image)
    }

}