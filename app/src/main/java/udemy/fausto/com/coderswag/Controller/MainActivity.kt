package udemy.fausto.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import udemy.fausto.com.coderswag.Adapters.CategoryAdapter
import udemy.fausto.com.coderswag.Adapters.CategoryRecycleAdapter
import udemy.fausto.com.coderswag.Model.Category
import udemy.fausto.com.coderswag.R
import udemy.fausto.com.coderswag.Services.DataService

// Esto a la branch

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
            //println(category.title)



            }

        categoryListView.adapter = adapter


        val layoutManger = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManger
        categoryListView.setHasFixedSize(true)




    }
}
