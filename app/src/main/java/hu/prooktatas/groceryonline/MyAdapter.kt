package hu.prooktatas.groceryonline

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class MyAdapter : RecyclerView.Adapter<GroceryItemViewHolder>(){
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryItemViewHolder {
      val rootView = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
      return GroceryItemViewHolder(rootView)
   }

   override fun getItemCount(): Int {
      return zoldsegek.size;
   }

   override fun onBindViewHolder(holder: GroceryItemViewHolder, position: Int) {
      val zn = zoldsegek[position].nev
    /*  holder.itemView.setOnClickListener{
         Log.d("zoldsegklikk",zn)
      }*/
      val drawable = holder.iv.resources.getDrawable(zoldsegek[position].kep)
      holder.iv.setImageDrawable(drawable)
      /*holder.iv.setOnClickListener {
         Log.d("zoldsegklikk",zn)
      }*/
      holder.tv.text = zn
   }


}

class GroceryItemViewHolder(v: View): RecyclerView.ViewHolder(v),View.OnClickListener{
   var iv: ImageView = v.findViewById(R.id.imageView)
   var tv: TextView = v.findViewById(R.id.textView)

   init {
       itemView.setOnClickListener(this)
   }

   override fun onClick(v: View?) {
      Log.d("zoldsegklikk",tv.text.toString())
   }

}