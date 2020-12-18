package com.example.myhakim

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myhakim.R.id.recycler_view
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private val medicalHistoryList = generateDummyList(500)
    private val adapter = MedicalHistoryAdapter(medicalHistoryList)

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
            R.drawable.ic_baseline_calendar, "New item at postition $index",
            "line 2", "line 3"
        )
        medicalHistoryList.add(index, newItem)
        adapter.notifyItemInserted(index)
    }
    fun removeItem(view: View){
        val index = Random.nextInt(8)
        medicalHistoryList.removeAt(index)
        adapter.notifyItemRemoved(index)
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
                MedicalHistory(drawable, "Item $i", "line 2", "line 3")
            list += item
        }
        return list
    }
}