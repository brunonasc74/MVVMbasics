package com.example.mvvmbasics.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmbasics.data.Quote
import com.example.mvvmbasics.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    :ViewModel() {

        fun getQuotes() = quoteRepository.getQuote()

        fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}