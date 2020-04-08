package com.example.kotlinmessenger.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinmessenger.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_chat_log.*
import kotlinx.android.synthetic.main.chat_from_row.view.*
import kotlinx.android.synthetic.main.chat_from_row.view.textView2
import kotlinx.android.synthetic.main.chat_to_row.view.*

class ChatLogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_log)


       val username = intent.getStringExtra(NewMessageActivity.USER_KEY)
       supportActionBar?.title = username

       //val user = intent = intent.getParcelableExtra<User>(NewMessageActivity.USER_KEY)
        //supportActionBar?.title = user.uid

       setupDummyData()

    }

    private fun setupDummyData() {
        val adapter = GroupAdapter<ViewHolder>()

        adapter.add(ChatFromItem("FROM MESSSSSSSAAAAGEEE"))
        adapter.add(ChatToItem("TO MESSSSSSAAAAGEEE\nTOMESSAGE"))
        adapter.add(ChatFromItem("FROM MESSSSSSSAAAAGEEE"))
        adapter.add(ChatToItem("TO MESSSSSSAAAAGEEE\nTOMESSAGE"))
        adapter.add(ChatFromItem("FROM MESSSSSSSAAAAGEEE"))
        adapter.add(ChatToItem("TO MESSSSSSAAAAGEEE\nTOMESSAGE"))
        adapter.add(ChatFromItem("FROM MESSSSSSSAAAAGEEE"))
        adapter.add(ChatToItem("TO MESSSSSSAAAAGEEE\nTOMESSAGE"))
        adapter.add(ChatFromItem("FROM MESSSSSSSAAAAGEEE"))
        adapter.add(ChatToItem("TO MESSSSSSAAAAGEEE\nTOMESSAGE"))


        recycleview_chat_log.adapter = adapter
    }
}

class ChatFromItem (val text: String): Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.textView2.text = text
    }

    override fun getLayout(): Int {
        return R.layout.chat_from_row
    }
}

class ChatToItem(val text: String): Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.textView2.text = text
    }

    override fun getLayout(): Int {
        return R.layout.chat_to_row
    }
}
