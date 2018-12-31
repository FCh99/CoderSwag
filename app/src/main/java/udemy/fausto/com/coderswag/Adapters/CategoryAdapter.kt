package udemy.fausto.com.coderswag.Adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.category_list_item.view.*
import udemy.fausto.com.coderswag.Model.Category
import udemy.fausto.com.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category> ): BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        val category = categories[position]


        val categoryImage = categoryView.categoryimage
        val categoryName = categoryView.categoryName
        println("Heavy computing")

        // Image
        // covert the imageName to a resource Id

        val resourceId =  context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        categoryName.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]

    }

    override fun getItemId(position: Int): Long {
        return 0

    }

    override fun getCount(): Int {
        return categories.count()

    }


}