package id.infiniteuny.repository

import id.infiniteuny.model.Todo
import retrofit2.Call

interface TodoRepository {
    fun getAllTodo(): Call<List<Todo>>
}