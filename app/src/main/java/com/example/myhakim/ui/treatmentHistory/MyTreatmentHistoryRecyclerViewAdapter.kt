package com.example.myhakim.ui.treatmentHistory

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myhakim.R
import com.example.myhakim.data.db.entity.TreatmentHistory

import com.example.myhakim.ui.treatmentHistory.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyTreatmentHistoryRecyclerViewAdapter(
        private val values: List<TreatmentHistory>)
    : RecyclerView.Adapter<MyTreatmentHistoryRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_treatment_history, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.hospital

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.medicationNameView)


        override fun toString(): String {
            return super.toString() + " '" + idView.text + "'"
        }
    }
}