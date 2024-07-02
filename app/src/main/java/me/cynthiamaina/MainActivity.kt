package me.cynthiamaina

import Blog
import BlogAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import me.cynthiamaina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvRecycleView.layoutManager=LinearLayoutManager(this)
        displayItems()

    }

    fun displayItems(){
        val item=Blog("Terry","The rod","2304"," It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.","http")
        val item2=Blog("Terry","The rod","2304"," It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.","http")
        val item3=Blog("Terry","The rod","2304"," It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.","http")
        val item4=Blog("Terry","The rod","2304"," It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.","http")


        val blog= listOf(item,item2,item3,item4)
        val BlogAdapter=BlogAdapter(blog)
        binding.tvRecycleView.adapter=BlogAdapter

    }

}