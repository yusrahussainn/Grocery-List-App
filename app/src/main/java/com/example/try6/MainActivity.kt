package com.example.try6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.try6.adapter.ItemRecyclerViewAdapter
import com.example.try6.model.ItemModel

class MainActivity : AppCompatActivity() {

    private val itemList = ArrayList<ItemModel>()
    private lateinit var itemRecyclerViewAdapter: ItemRecyclerViewAdapter
    private lateinit var itemRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUI()
    }

    private fun initUI(){
        itemRecyclerView = findViewById(R.id.recyclerView)
        itemRecyclerView.layoutManager = LinearLayoutManager(this)


        itemList.add(ItemModel(image = R.drawable.apple, "Apple  (6 apples)"))
        itemList.add(ItemModel(image = R.drawable.milk, "Milk   (1 gallon)"))
        itemList.add(ItemModel(image = R.drawable.banana, "Banana (12 bananas)"))
        itemList.add(ItemModel(image = R.drawable.bread, "Bread (1 loaf)"))
        itemList.add(ItemModel(image = R.drawable.carrot, "Carrot (1 kg)"))
        itemList.add(ItemModel(image = R.drawable.cheese, "Cheese (500 g)"))
        itemList.add(ItemModel(image = R.drawable.eggs, "Eggs (12 eggs)"))
        itemList.add(ItemModel(image = R.drawable.oranges, "Oranges (8 oranges)"))
        itemList.add(ItemModel(image = R.drawable.yougurt, "Yogurt (1 kg)"))
        itemList.add(ItemModel(image = R.drawable.tomatoes, "Tomatoes (1 kg)"))
        itemList.add(ItemModel(image = R.drawable.chicken, "Chicken (2 kg)"))
        itemList.add(ItemModel(image = R.drawable.beef, "Beef (1.5 kg)"))


        itemRecyclerViewAdapter = ItemRecyclerViewAdapter(itemList)
        itemRecyclerView.adapter = itemRecyclerViewAdapter
    }
}