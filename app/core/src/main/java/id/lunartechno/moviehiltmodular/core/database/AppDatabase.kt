package id.lunartechno.moviehiltmodular.core.database

import androidx.room.RoomDatabase

//@Database(entities = [TransactionEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract val databaseDao: DatabaseDao
}