import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import me.cynthiamaina.R

class BlogAdapter(val blog:List<Blog>):RecyclerView.Adapter<BlogView> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogView {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.blog_list_item,parent,false)
        return BlogView(itemView)
    }

    override fun getItemCount(): Int {
        return blog.size
    }

    override fun onBindViewHolder(holder: BlogView, position: Int) {
        val blog=blog[position]
        holder.tvAthor.text=blog.author
        holder.tvTitle.text=blog.title
        holder.tvPublish.text=blog.publish
        holder.tvPreview.text=blog.preview
        holder.tvLink.text=blog.link
    }
}


class BlogView(itemView:View):RecyclerView.ViewHolder(itemView){
   val tvAthor=itemView.findViewById<TextView>(R.id.tvAthor)
    val tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
    val tvPublish=itemView.findViewById<TextView>(R.id.tvPublish)
    val tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
    val tvLink=itemView.findViewById<TextView>(R.id.tvLink)

}