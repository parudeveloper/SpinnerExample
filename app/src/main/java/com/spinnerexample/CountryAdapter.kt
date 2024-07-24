package com.spinnerexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CountryAdapter(val context :Context,var countriesData :ArrayList<Countries>) : BaseAdapter()
{
    override fun getCount(): Int = countriesData.size

    override fun getItem(position: Int): Any =countriesData[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int, parent: View?, p2: ViewGroup?): View {
        var  convertView = LayoutInflater.from(context).inflate(R.layout.item_country, p2, false)
        var ivCountry = convertView.findViewById<ImageView>(R.id.ivCountry)
        var tvCountry = convertView.findViewById<TextView>(R.id.tvCountry)
        ivCountry.setImageResource(countriesData[position].countryFlag)
        tvCountry.text = countriesData[position].countryCode


        return convertView

    }
}