package com.hamed.roomlivedata

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hamed.roomlivedata.db.User
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(val context : Context) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    private var mUserList : List<User>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =  LayoutInflater.from(context).inflate(R.layout.item_user,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if (mUserList!=null) mUserList!!.size else 0
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.text_name.text = mUserList!![position].name
        holder.text_family.text = mUserList!![position].family
    }

    fun setUserList(userList : List<User>){
        mUserList = userList
        notifyDataSetChanged()
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val text_name = view.text_name
        val text_family = view.text_family
    }
}