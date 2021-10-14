package suitecrm.com.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.Drawer
import suitecrm.com.todo.databinding.ActivityMainBinding
import suitecrm.com.todo.ui.app.elements.AppDrawer

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initLogic()
    }

    private fun initLogic() {
        setSupportActionBar(mToolbar)
        mAppDrawer.create()
        mAppDrawer = AppDrawer(this, mToolbar)
        supportFragmentManager.beginTransaction()
            .replace(R.id.data_container, DoListFragment()).commit()
    }


    private fun initFields() {
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)

    }
}