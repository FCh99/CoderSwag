package udemy.fausto.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import udemy.fausto.com.coderswag.Model.Product
import udemy.fausto.com.coderswag.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val product =  intent.getSerializableExtra("product") as Product


        textViewDetailId.text = product.title
        textViewPriceId.text = product.price

        // traer la imagen

        val stringImage = product.image
        val resourceId = this.resources.getIdentifier(stringImage, "drawable", this.packageName)

        imageViewDetailId.setImageResource(resourceId)






    }
}
