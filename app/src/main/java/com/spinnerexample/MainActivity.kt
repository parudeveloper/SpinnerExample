package com.spinnerexample

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity

import com.spinnerexample.databinding.ActivityMainBinding
import java.util.ArrayList
//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
class MainActivity : AppCompatActivity() {
    var listOfCountriesData = ArrayList<Countries>()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        InitViews()

    }

    private fun InitViews() {
        val countryAdapter = CountryAdapter(applicationContext, setUpCountryWitCodeData())
        binding.spinnerCountry.adapter = countryAdapter

        binding.spinnerCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, position.toString(), LENGTH_LONG).show()


            }
        }
        }




    private fun setUpCountryWitCodeData(): ArrayList<Countries> {
        listOfCountriesData = ArrayList()
        listOfCountriesData.add(Countries("", 0))
        listOfCountriesData.add(Countries("+91", R.drawable.flag_india))
        listOfCountriesData.add(Countries("+61", R.drawable.flag_uk))
        listOfCountriesData.add(Countries("+71", R.drawable.flag_pak))

        return listOfCountriesData
    }
}