package lat.pam.orderfood

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ConfirmationActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView // Deklarasikan bottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        // Inisialisasi bottomNavigationView
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        val username = intent.getStringExtra("username")
        val makanan = intent.getStringExtra("makanan")

        val tv = findViewById<TextView>(R.id.tvPesan)
        tv.text = "Halo $username, \nTerima kasih sudah memesan $makanan. Mohon tunggu di alamat tujuan Anda."

        findViewById<View>(R.id.btnKembali).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        // Set listener untuk bottomNavigationView
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this@ConfirmationActivity, HomeActivity::class.java))
                    return@setOnItemSelectedListener true
                }

                R.id.nav_order -> {
                    startActivity(Intent(this@ConfirmationActivity, OrderActivity::class.java))
                    return@setOnItemSelectedListener true
                }

                R.id.nav_profile -> {

                }
            }
            false
        }
    }
}
