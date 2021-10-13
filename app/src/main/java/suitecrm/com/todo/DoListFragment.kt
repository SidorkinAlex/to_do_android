package suitecrm.com.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import suitecrm.com.todo.databinding.FragmentDoListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DoListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DoListFragment : Fragment() {
private lateinit var mBinding: FragmentDoListBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        mBinding = FragmentDoListBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
    }
}