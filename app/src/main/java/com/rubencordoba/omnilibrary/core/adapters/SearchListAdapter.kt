package com.rubencordoba.omnilibrary.core.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rubencordoba.omnilibrary.R
import com.rubencordoba.omnilibrary.core.models.BookSearchItem

class SearchListAdapter(
    private val dataSet: ArrayList<BookSearchItem>,
    private val onItemClickListener: OnItemClickListener
): RecyclerView.Adapter<SearchListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val bookTitleTextView: TextView
        val bookAuthorTextView: TextView
        val bookPublishDateTextView: TextView
        val bookIsbnTextView: TextView

        init {
            bookTitleTextView = view.findViewById(R.id.search_list_item_book_title_text)
            bookAuthorTextView = view.findViewById(R.id.search_list_item_author_text)
            bookPublishDateTextView = view.findViewById(R.id.search_list_item_publish_date_text)
            bookIsbnTextView = view.findViewById(R.id.search_list_item_isbn_text)
        }

        fun bindView(book: BookSearchItem, listener: OnItemClickListener) {
            itemView.setOnClickListener { listener.onItemClick(book) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_search_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bookTitleTextView.text = dataSet[position].bookTitle
        holder.bookAuthorTextView.text = dataSet[position].bookAuthor
        holder.bookPublishDateTextView.text = dataSet[position].bookPublishDate.toString()
        holder.bookIsbnTextView.text = dataSet[position].bookIsbn

        holder.bindView(dataSet[position], onItemClickListener)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    interface OnItemClickListener {
        fun onItemClick(book: BookSearchItem)
    }
}