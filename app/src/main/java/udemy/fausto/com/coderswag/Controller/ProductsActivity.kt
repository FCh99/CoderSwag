package udemy.fausto.com.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
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

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }


        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }
        
        // Intent to Detail



        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager as RecyclerView.LayoutManager?
        productsListView.adapter = adapter



    }
}
