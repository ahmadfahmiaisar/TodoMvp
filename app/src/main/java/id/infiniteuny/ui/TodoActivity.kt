package id.infiniteuny.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.infiniteuny.model.Todo
import id.infiniteuny.repository.TodoRepositoryImpl
import id.infiniteuny.R

class TodoActivity : AppCompatActivity(), TodoContract {

    private lateinit var presenter: TodoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        val todoRepo = TodoRepositoryImpl()
        presenter = TodoPresenter(this, todoRepo)
        presenter.getAllTodo()
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showDataTodo(listTodo: List<Todo>) {
        Log.d("ISINYA", "showDataTodo: $listTodo")
    }

    override fun showError(errorMessage: String) {
    }
}