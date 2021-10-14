package suitecrm.com.todo.ui.app.elements

import android.view.View
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import suitecrm.com.todo.DoListFragment
import suitecrm.com.todo.MainActivity
import suitecrm.com.todo.R
import suitecrm.com.todo.SettingsFragment

class AppDrawer(
    var mainActivity: MainActivity,
    var toolbar: Toolbar
) {
    private lateinit var mDriver: Drawer
    private lateinit var mHeader: AccountHeader

    fun create() {
        createHeader()
        createDawer()
    }

    private fun createDawer() {
        mDriver = DrawerBuilder()
            .withActivity(mainActivity)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(1)
                    .withIconTintingEnabled(true)
                    .withName(R.string.main_toolbar_checklist)
                    .withSelectable(false)
                    .withIcon(R.drawable.checklist),
                PrimaryDrawerItem().withIdentifier(2)
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
                    when (position) {
                        1 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.data_container, DoListFragment())
                            .commit()
                        2 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.data_container, SettingsFragment())
                            .commit()
                    }
                    return false
                }
            })
            .build()
    }

    private fun createHeader() {
        mHeader = AccountHeaderBuilder()
            .withActivity(mainActivity)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem()
                    .withName("Alex Sidorkins")
                    .withEmail("test@test.ru")
            ).build()
    }
}