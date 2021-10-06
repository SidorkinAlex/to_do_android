package suitecrm.com.todochecklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import suitecrm.com.todochecklist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBuinding : ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}