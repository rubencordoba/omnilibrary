package com.rubencordoba.omnilibrary.core.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rubencordoba.omnilibrary.R
import com.rubencordoba.omnilibrary.core.models.BookSearchItem

class SearchListAdapter(private val dataSet: Array<BookSearchItem>): RecyclerView.Adapter<SearchListAdapter.ViewHolder>() {

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
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}