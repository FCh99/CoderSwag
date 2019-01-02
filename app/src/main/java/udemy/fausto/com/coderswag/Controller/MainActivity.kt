package udemy.fausto.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import udemy.fausto.com.coderswag.Adapters.CategoryAdapter
import udemy.fausto.com.coderswag.Model.Category
import udemy.fausto.com.coderswag.R
import udemy.fausto.com.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "you clicked ${category.title} cell", Toast.LENGTH_SHORT).show()

        }



    }
}
