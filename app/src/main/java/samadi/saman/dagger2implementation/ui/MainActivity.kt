package samadi.saman.dagger2implementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import samadi.saman.dagger2implementation.R
import samadi.saman.dagger2implementation.viewmodels.DaggerMainViewModelFactory
import samadi.saman.dagger2implementation.viewmodels.MainViewModel
import java.net.DatagramSocket
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerMainViewModelFactory.builder().build().inject(this)
        setContentView(R.layout.activity_main)
        viewModel.getData().observe(this) {
            findViewById<TextView>(R.id.textView).text = it
        }
    }
}