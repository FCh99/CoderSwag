package udemy.fausto.com.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.category_list_item.view.*
import udemy.fausto.com.coderswag.Model.Category
import udemy.fausto.com.coderswag.R

class CategoryAdapter(val context: Context, val categories: List<Category> ): BaseAdapter() {

    //val context = context
    //val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.categoryImage
            holder.categoryName = categoryView.categoryName
            println("---> I exist for the first time ¡")
            categoryView.tag = holder

        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("---> Go green recycle ¡")
        }

        val category = categories[position]

        // Image
        val resourceId =  context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        holder.categoryName?.text = category.title
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

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }


}