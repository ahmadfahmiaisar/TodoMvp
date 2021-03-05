package id.infiniteuny.ui

import id.infiniteuny.model.Todo

interface TodoContract {
    fun showLoading()
    fun hideLoading()
    fun showDataTodo(listTodo: List<Todo>)
    fun showError(errorMessage: String)
}