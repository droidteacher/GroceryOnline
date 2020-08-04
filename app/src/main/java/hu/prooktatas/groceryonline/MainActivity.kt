package hu.prooktatas.groceryonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv : RecyclerView = findViewById(R.id.zoldseglistarv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter()


    }
}


data class Zoldseg(val kep:Int,val nev:String)
val zoldsegek = listOf<Zoldseg>(
    Zoldseg(R.drawable.carrot,"Répa"),
    Zoldseg(R.drawable.chilli_pepper,"Paprika"),
    Zoldseg(R.drawable.mango,"Mangó"),
    Zoldseg(R.drawable.peas,"Borsó"),
    Zoldseg(R.drawable.pineapple,"Ananász"),
    Zoldseg(R.drawable.tomato,"Paradicsom"),
    Zoldseg(R.drawable.potato,"Krumpli")
)