package com.example.myhakim

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myhakim.R.id.recycler_view
import kotlin.random.Random


class MainActivity : AppCompatActivity(),MedicalHistoryAdapter.OnItemClickListener {
    private val medicalHistoryList = generateDummyList(500)
    private val adapter = MedicalHistoryAdapter(medicalHistoryList, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<RecyclerView>(recycler_view).adapter = adapter
        findViewById<RecyclerView>(recycler_view).layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(recycler_view).setHasFixedSize(true)


    }
    fun insertItem(view: View){
        val index = Random.nextInt(8)

        val newItem = MedicalHistory(
            R.drawable.ic_baseline_calendar, "New Treatment at Position $index",
            "Medication", "Hospital"
        )
        medicalHistoryList.add(index, newItem)
        adapter.notifyItemInserted(index)
    }
    fun removeItem(view: View){
        val index = Random.nextInt(8)
        medicalHistoryList.removeAt(index)
        adapter.notifyItemRemoved(index)
    }

    override fun onItemClcick(position: Int) {
        Toast.makeText(this, "Treatment $position clicked", Toast.LENGTH_SHORT).show()
        val clickedItem = medicalHistoryList[position]
        clickedItem.text1 ="clicked"
        adapter.notifyItemChanged(position)
    }

    private fun generateDummyList(size: Int): ArrayList<MedicalHistory> {
        val list = ArrayList<MedicalHistory>()
        for (i: Int in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_baseline_cale
                1 -> R.drawable.ic_baseline_calen
                else -> R.drawable.ic_baseline_calendar
            }
            val item =
                MedicalHistory(drawable, "Treatment $i", "Medication", "Hospital")
            list += item
        }
        return list
    }
}