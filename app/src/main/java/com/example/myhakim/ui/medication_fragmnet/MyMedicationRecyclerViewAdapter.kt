package com.example.myhakim.ui.medication_fragmnet

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myhakim.R
import com.example.myhakim.data.db.models.Medication

import com.example.myhakim.ui.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyMedicationRecyclerViewAdapter(
    private val values: List<Medication>
) : RecyclerView.Adapter<MyMedicationRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_medication, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.contentView.text = item.name
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val contentView: TextView = view.findViewById(R.id.medicationNameView)

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }
}