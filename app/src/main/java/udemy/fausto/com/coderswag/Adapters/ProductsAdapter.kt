package udemy.fausto.com.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.product_list_item.view.*
import udemy.fausto.com.coderswag.Model.Product

class ProductsAdapter(val context: Context, val products: List<Product> ) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView.productImage!!
        val productName = itemView.productName!!
        val productPrice = itemView.productPrice!!

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price

        }






    }


}