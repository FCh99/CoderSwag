package udemy.fausto.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_products.*
import udemy.fausto.com.coderswag.Adapters.ProductsAdapter
import udemy.fausto.com.coderswag.R
import udemy.fausto.com.coderswag.Services.DataService
import udemy.fausto.com.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        //println("-------->")
        //println(categoryType)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter



    }
}
