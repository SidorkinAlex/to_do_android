package suitecrm.com.todo

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import suitecrm.com.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mDriver: Drawer
    private lateinit var mHeader: AccountHeader
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
        createHeader()
        createDawer()
    }

    private fun createDawer() {
        mDriver = DrawerBuilder()
            .withActivity(this)
            .withToolbar(mToolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName(R.string.main_toolbar_checklist)
                    .withSelectable(false)
                    .withIcon(R.drawable.checklist),
                PrimaryDrawerItem().withIdentifier(200)
                    .withIconTintingEnabled(true)
                    .withName(R.string.main_toolbar_settings)
                    .withSelectable(false)
                    .withIcon(R.drawable.edit_tool)
            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    Toast.makeText(applicationContext, position.toString(), Toast.LENGTH_SHORT)
                        .show()
                    return false
                }
            })
            .build()
    }

    private fun createHeader() {
        mHeader = AccountHeaderBuilder()
            .withActivity(this)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem()
                    .withName("Alex Sidorkins")
                    .withEmail("test@test.ru")
            ).build()
    }


    private fun initFields() {
        mToolbar = mBinding.mainToolbar

    }
}