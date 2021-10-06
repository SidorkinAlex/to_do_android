package suitecrm.com.todochecklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import suitecrm.com.todochecklist.databinding.ActivityMainBinding
import java.sql.Driver

class MainActivity : AppCompatActivity() {
    private lateinit var mBuinding : ActivityMainBinding;
    private lateinit var mDriver: Driver;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}