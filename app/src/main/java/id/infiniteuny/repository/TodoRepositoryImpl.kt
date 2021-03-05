package id.infiniteuny.repository

import id.infiniteuny.model.Todo
import id.infiniteuny.services.AppServices
import retrofit2.Call

class TodoRepositoryImpl : TodoRepository {
    override fun getAllTodo(): Call<List<Todo>> {
        return AppServices.create().getAllTodo()
    }
}