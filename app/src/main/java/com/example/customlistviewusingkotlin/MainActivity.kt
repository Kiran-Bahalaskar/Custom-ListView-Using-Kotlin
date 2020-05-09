package com.example.customlistviewusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.customlistviewusingkotlin.Adapter.MyAdapter
import com.example.customlistviewusingkotlin.Model.Model

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listview)
        //here friends i will create a separate listview variable
        var list = mutableListOf<Model>()


        list.add(Model("Facebook", "facebook description....", R.drawable.facebook ))
        list.add(Model("What's app", "what's app description....", R.drawable.whats_app ))
        list.add(Model("Instagram", "instagram description....", R.drawable.instagram ))
        list.add(Model("Twitter", "twitter description....", R.drawable.twitter ))
        list.add(Model("YouTube", "youtube description....", R.drawable.youtube ))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0)
            {
                Toast.makeText(this,"you click on facebook",Toast.LENGTH_SHORT).show()
            }
            if (position == 1)
            {
                Toast.makeText(this,"you click on Whats app",Toast.LENGTH_SHORT).show()
            }
            if (position == 2)
            {
                Toast.makeText(this,"you click on Instagram",Toast.LENGTH_SHORT).show()
            }
            if (position == 3)
            {
                Toast.makeText(this,"you click on Twitter",Toast.LENGTH_SHORT).show()
            }
            if (position == 4)
            {
                Toast.makeText(this,"you click on YouTube",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
