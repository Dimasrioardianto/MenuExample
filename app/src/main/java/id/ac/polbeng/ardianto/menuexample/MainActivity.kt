package id.ac.polbeng.ardianto.menuexample

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import id.ac.polbeng.ardianto.menuexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.myTollbar)
        }
    //menambahkan override fungsi oncreate
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //menambahkan isi dari pilihan menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuFile -> {
                showMessage("File Menu")
                return true
            }
            R.id.menuEdit -> {
                showMessage("Edit Menu")
                return true
            }
            R.id.menuHelp -> {
                showMessage("Help Menu")
                return true
            }
            R.id.menuExit -> {
                showMessage("Exit")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMessage(msg: String) {
        Snackbar.make(binding.rootLayout, msg,
            Snackbar.LENGTH_LONG).show()
    }
}