package programming.learning.myshoppinglist.UI.ShoppingList

import androidx.appcompat.view.menu.ActionMenuItem
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import programming.learning.myshoppinglist.Data.DB.Entities.ShoppingItem
import programming.learning.myshoppinglist.Data.Repositories.ShoppingRepository

class ShoppingViewModel(
    private val repository: ShoppingRepository
): ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}