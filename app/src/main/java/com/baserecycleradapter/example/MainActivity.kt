package com.baserecycleradapter.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.base.recycleradapter.BaseRecycleAdapter
import com.base.recycleradapter.BaseRecyclerItem
import com.baserecycleradapter.example.advance.factory.ViewHolderFactory
import com.baserecycleradapter.example.advance.item.AnimalRecycleItem
import com.baserecycleradapter.example.advance.item.FruitRecycleItem
import com.baserecycleradapter.example.advance.item.HeaderRecycleItem
import com.baserecycleradapter.example.advance.model.Animal
import com.baserecycleradapter.example.advance.model.Fruit
import com.baserecycleradapter.example.advance.model.Header
import com.baserecycleradapter.example.simple.SimpleRecycleAdapter
import com.baserecycleradapter.example.simple.model.HeaderDataModel
import com.baserecycleradapter.example.simple.model.ItemDataModel
import com.baserecycleradapter.example.simple.model.RecycleItem

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

//        setSimpleRecyclerView()
        setAdvanceRecyclerView()//refer this
    }

    private fun setAdvanceRecyclerView() {
        val list: ArrayList<BaseRecyclerItem> = ArrayList()
        list.add(HeaderRecycleItem(Header("Fruit")))
        list.add(
            FruitRecycleItem(
                Fruit(
                    "Apple",
                    "https://i.pinimg.com/564x/03/52/63/03526336ef23211c5a4c91db0ff12d17.jpg",
                    120
                )
            )
        )
        list.add(
            FruitRecycleItem(
                Fruit(
                    "Grapes",
                    "https://i.pinimg.com/564x/cc/a7/de/cca7de67553d58731481302b01f02747.jpg",
                    180
                )
            )
        )
        list.add(
            FruitRecycleItem(
                Fruit(
                    "Pineapple",
                    "https://i.pinimg.com/564x/12/89/34/128934da9dae671850002432ca1f1ec0.jpg",
                    80
                )
            )
        )
        list.add(
            FruitRecycleItem(
                Fruit(
                    "Orange",
                    "https://i.pinimg.com/564x/be/94/87/be948741ad3f33a070c08faf03beb0fe.jpg",
                    60
                )
            )
        )
        list.add(
            FruitRecycleItem(
                Fruit(
                    "Kiwi",
                    "https://i.pinimg.com/564x/15/25/e0/1525e0bb641abe564fa4897023832a2e.jpg",
                    580
                )
            )
        )
        list.add(HeaderRecycleItem(Header("Animal")))
        list.add(
            AnimalRecycleItem(
                Animal(
                    "Lion",
                    "Wild",
                    "https://i.pinimg.com/564x/91/d1/ab/91d1abc036c07ef85bdeefdf00cfdd69.jpg",
                    15
                )
            )
        )
        list.add(
            AnimalRecycleItem(
                Animal(
                    "Dog",
                    "Pet",
                    "https://i.pinimg.com/564x/9d/d4/2a/9dd42a3ea42bb750db2b70906cbd46c9.jpg",
                    13
                )
            )
        )
        list.add(
            AnimalRecycleItem(
                Animal(
                    "Dear",
                    "Wild",
                    "https://i.pinimg.com/564x/1e/c8/70/1ec8700ab87ee67ac0368b395798274d.jpg",
                    10
                )
            )
        )
        list.add(
            AnimalRecycleItem(
                Animal(
                    "Cow",
                    "Pet",
                    "https://i.pinimg.com/564x/2d/d2/f3/2dd2f38f9c13f954bdc6d1bc22975eca.jpg",
                    7
                )
            )
        )
        list.add(
            AnimalRecycleItem(
                Animal(
                    "Cat",
                    "Pet",
                    "https://i.pinimg.com/564x/d2/9e/96/d29e966cd3288a7a8ccabc075aa1fbf9.jpg",
                    12
                )
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BaseRecycleAdapter<BaseRecyclerItem>(list, ViewHolderFactory)
    }

    private fun setSimpleRecyclerView() {
        val header1 = HeaderDataModel(R.layout.simple_header, "Fruit")
        val fruit1 = ItemDataModel(R.layout.simple_item_data, "Apple", 120)
        val fruit2 = ItemDataModel(R.layout.simple_item_data, "Grapes", 180)
        val fruit3 = ItemDataModel(R.layout.simple_item_data, "Pineapple", 80)
        val fruit4 = ItemDataModel(R.layout.simple_item_data, "Orange", 60)
        val fruit5 = ItemDataModel(R.layout.simple_item_data, "Kiwi", 580)
        val header2 = HeaderDataModel(R.layout.simple_header, "Vegetable")
        val item6 = ItemDataModel(R.layout.simple_item_data, "Potato", 25)
        val item7 = ItemDataModel(R.layout.simple_item_data, "Onion", 40)
        val item8 = ItemDataModel(R.layout.simple_item_data, "Cabbage", 20)
        val item9 = ItemDataModel(R.layout.simple_item_data, "Carrot", 65)

        val itemList: ArrayList<RecycleItem> = ArrayList()
        itemList.add(header1)
        itemList.add(fruit1)
        itemList.add(fruit2)
        itemList.add(fruit3)
        itemList.add(fruit4)
        itemList.add(fruit5)
        itemList.add(header2)
        itemList.add(item6)
        itemList.add(item7)
        itemList.add(item8)
        itemList.add(item9)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SimpleRecycleAdapter(itemList)
    }
}