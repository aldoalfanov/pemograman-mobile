package com.reynaldo.leo.recycle

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*
import java.util.ArrayList

class Adapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Adapter.Holder, position: Int) {
        holder.view.lbList.text = list.get(position).name
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)

}
