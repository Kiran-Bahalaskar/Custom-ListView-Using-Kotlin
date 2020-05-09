package com.example.customlistviewusingkotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.customlistviewusingkotlin.Model.Model
import com.example.customlistviewusingkotlin.R
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(var mCtxt: Context, var resource: Int, var items:List<Model>) : ArrayAdapter<Model>(mCtxt, resource, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtxt)
        val view : View = layoutInflater.inflate(resource, null)

        val imageView : ImageView = view.findViewById(R.id.image)
        val titleTextView : TextView = view.findViewById(R.id.textView1)
        val descriptionTextView : TextView = view.findViewById(R.id.textView2)

        var mItem:Model = items[position]
        imageView.setImageDrawable(mCtxt.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        return view
    }
}