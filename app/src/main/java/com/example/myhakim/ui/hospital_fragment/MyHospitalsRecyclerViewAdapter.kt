package com.example.myhakim.ui.hospital_fragment

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.myhakim.R
import com.example.myhakim.data.db.entity.Hospital
import com.example.myhakim.data.dummyData.Dummy

import com.example.myhakim.ui.hospital_fragment.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyHospitalsRecyclerViewAdapter(
    private val values: List<Hospital>
) : RecyclerView.Adapter<MyHospitalsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.hospital_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
       holder.hospitalNameView.text = item.name

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val hospitalNameView: TextView = view.findViewById(R.id.hospitalNameView)
        val detailsButton: Button = view.findViewById(R.id.detailsButton)


        override fun toString(): String {
            return super.toString() + " '" + hospitalNameView.text + "'"
        }
    }
}