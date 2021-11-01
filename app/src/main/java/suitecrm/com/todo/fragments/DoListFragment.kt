package suitecrm.com.todo.fragments

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment
import suitecrm.com.todo.R
import suitecrm.com.todo.ui.app.elements.DoListViewBuilder


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
        for (i in 1..100) {

            var view1: LinearLayout = DoListViewBuilder()
                    .createRowChecklistView(root.context)
            //var view = LayoutInflater.from(this.context).inflate(R.layout.to_do_row, root,false)
            view1.id = (120 + i)
            root.addView(view1)


        }
    }

}