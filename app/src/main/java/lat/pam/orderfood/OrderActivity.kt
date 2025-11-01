package lat.pam.orderfood

import android.annotation.SuppressLint
import lat.pam.orderfood.R
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.ImageView



class OrderActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView // Deklarasikan bottomNavigationView

    var btnKirim: Button? = null
    var makanan: String? = null
    var username: String? = null

    private var gambarMakanan: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        btnKirim = findViewById<Button?>(R.id.btnKirim)
        makanan = getIntent().getStringExtra("makanan")
        username = getIntent().getStringExtra("username")

        gambarMakanan = intent.getIntExtra("gambar", 0)

        val tvPesanan = findViewById<TextView>(R.id.tvPesanan)
        val ivMakanan = findViewById<ImageView>(R.id.ivMakanan)

        tvPesanan.text = "Pesanan saya: $makanan"
        ivMakanan.setImageResource(gambarMakanan)


        (findViewById<View?>(R.id.tvPesanan) as TextView)
            .setText("Pesanan saya: " + makanan)

        btnKirim!!.setOnClickListener(View.OnClickListener { v: View? ->
            val i = Intent(this, AddressActivity::class.java)
            i.putExtra("makanan", makanan)
            i.putExtra("username", username)
            startActivity(i)
        })


        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this@OrderActivity, HomeActivity::class.java))
                    true
                }
                R.id.nav_order -> {
                    Toast.makeText(this@OrderActivity, "Anda berada di Order", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_profile -> {
                    true
                }
                else -> false
            }
        }

    }


}
