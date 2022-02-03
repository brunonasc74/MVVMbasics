package com.example.mvvmbasics.data

class FakeDatabase private constructor() {

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        val quoteDao = FakeDatabase()

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also {instance = it}
            }
    }
}