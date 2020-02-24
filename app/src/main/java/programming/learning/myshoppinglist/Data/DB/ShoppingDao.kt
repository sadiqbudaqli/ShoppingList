package programming.learning.myshoppinglist.Data.DB

import androidx.lifecycle.LiveData
import androidx.room.*
import programming.learning.myshoppinglist.Data.DB.Entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}