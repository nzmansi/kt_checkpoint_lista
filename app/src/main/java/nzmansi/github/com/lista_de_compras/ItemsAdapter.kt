package nzmansi.github.com.lista_de_compras

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class ItemsAdapter : RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {


    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}