package suitecrm.com.todo.fragments

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.fragment.app.Fragment
import com.mikepenz.materialdrawer.util.ifNotNull
import suitecrm.com.todo.R
import suitecrm.com.todo.databinding.FragmentDoListBinding
import suitecrm.com.todo.ui.app.elements.DoListViewBuilder
import suitecrm.com.todo.ui.app.elements.ToDoListActionMenuController
import java.lang.Exception


/**
 * A simple [Fragment] subclass.
 * Use the [DoListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DoListFragment : BaseFragment(R.layout.fragment_do_list) {

//    override fun onResume() {
//        super.onResume()
//        val root = requireView().findViewById<LinearLayout>(R.id.mainToDoListDiv)
//        for (i in 1..10) {
//            var view = LayoutInflater.from(this.context).inflate(R.layout.to_do_row, root,false)
//            view.id = (120 + i)
//            root.addView(view)
//        }
//    }

    override fun onResume() {
        super.onResume()
        val root = requireView().findViewById<LinearLayout>(R.id.mainToDoListDiv)
        for (i in 1..10) {

            var view1: LinearLayout = DoListViewBuilder()
                    .createRowChecklistView(root.context)
            //var view = LayoutInflater.from(this.context).inflate(R.layout.to_do_row, root,false)
            view1.id = (120 + i)
            root.addView(view1)


        }
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.do_list_menu, menu)
        val mC = ToDoListActionMenuController()
        activity.ifNotNull {
            mC.initMenuEvents(menu, activity as AppCompatActivity)
        }
       }
}



