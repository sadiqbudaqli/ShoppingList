package programming.learning.myshoppinglist.Data.Repositories

import programming.learning.myshoppinglist.Data.DB.Entities.ShoppingItem
import programming.learning.myshoppinglist.Data.DB.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
){
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}