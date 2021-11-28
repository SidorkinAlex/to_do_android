package suitecrm.com.todo.ui.app.elements

import android.app.Activity
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import suitecrm.com.todo.R
import suitecrm.com.todo.fragments.NewTask

class ToDoListActionMenuController {
    fun initMenuEvents(actionMenu: Menu,activity : AppCompatActivity){
        val addButton = actionMenu.findItem(R.id.add_task)

        addButton?.setOnMenuItemClickListener {

            activity.supportFragmentManager.beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.data_container, NewTask())
                    .commit()
            true
        }
    }
}