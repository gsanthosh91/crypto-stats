package com.mvvm.app.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mvvm.app.R
import com.mvvm.app.databinding.ListItemCoinBinding
import com.mvvm.app.model.Coin

class CoinAdapter : RecyclerView.Adapter<CoinAdapter.MyViewHolder>() {

    var itemList = listOf<Coin>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ListItemCoinBinding>(
            LayoutInflater.from(parent.context),
            R.layout.list_item_coin,
            parent,
            false
        ).let {
            MyViewHolder(it)
        }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =
        holder.bind(itemList[position])

    inner class MyViewHolder(private val binding: ListItemCoinBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            /*binding.root.setOnClickListener {
                MaterialDialog(binding.root.context).show {
                    customView(
                            view = DataBindingUtil.inflate<DialogDetailBinding>(
                                    LayoutInflater.from(binding.root.context),
                                    R.layout.dialog_detail,
                                    null,
                                    false
                            ).also {
                                it.character = binding.character
                                it.imageViewDialogDetailPhoto.clipToOutline = true
                            }.root
                    )
                    cornerRadius(binding.root.context.resources.getDimension(R.dimen.dp_8))
                }
            }*/
        }

        fun bind(item: Coin) {
            binding.apply {
                coin = item
                executePendingBindings()
            }
        }

    }

}
