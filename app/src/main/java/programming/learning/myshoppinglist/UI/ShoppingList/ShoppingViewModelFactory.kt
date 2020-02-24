package programming.learning.myshoppinglist.UI.ShoppingList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import programming.learning.myshoppinglist.Data.Repositories.ShoppingRepository

class ShoppingViewModelFactory(
    private val repository: ShoppingRepository
):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}