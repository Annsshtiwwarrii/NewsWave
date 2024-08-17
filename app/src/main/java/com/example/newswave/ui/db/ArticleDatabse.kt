package com.example.newswave.ui.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newswave.ui.models.Article

@Database(
entities = [Article::class],
    version = 1
)
@TypeConverters(Convertors::class)
abstract class ArticleDatabse : RoomDatabase() {
    abstract fun getArticleDao():ArticleDao
    companion object{
        @Volatile
        private var instance:ArticleDatabse?=null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also{ instance = it}
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabse::class.java,
                "artice_db.db"
            ).build()


    }
}