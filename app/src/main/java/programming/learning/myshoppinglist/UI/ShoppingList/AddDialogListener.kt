package programming.learning.myshoppinglist.UI.ShoppingList

import programming.learning.myshoppinglist.Data.DB.Entities.ShoppingItem

interface AddDialogListener {

    fun onAddButtonClicked(item: ShoppingItem)
}