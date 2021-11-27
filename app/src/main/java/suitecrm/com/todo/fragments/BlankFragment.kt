package suitecrm.com.todo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import suitecrm.com.todo.R


 open class BaseFragment(var layout:Int) : Fragment() {

    protected lateinit var mRootView: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = inflater.inflate(layout,container,false)
        return mRootView
    }

}