package com.example.alex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.alex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding
    private lateinit var views:MutableList<View>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        views= mutableListOf()
        binding.fab.setOnClickListener{
            val view:View=layoutInflater.inflate(R.layout.order_item,null)
            var foot:EditText=view.findViewById(R.id.foot)
            var count:EditText=view.findViewById(R.id.count)
            var price:EditText=view.findViewById(R.id.price)
            views.add(view)
            binding.orders.addView(view)
        }
        binding.order.setOnClickListener{

        }
    }
}