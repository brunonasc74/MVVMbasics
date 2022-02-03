package com.example.mvvmbasics.data

class FakeDatabase private constructor() {

    val quoteDao = FakeDatabase()

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also {instance = it}
            }
    }
}