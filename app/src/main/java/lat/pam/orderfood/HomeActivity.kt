package lat.pam.orderfood

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    var username: String? = null
    var makanan: String? = ""
    var btnNext: Button? = null
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        username = intent.getStringExtra("username")
        btnNext = findViewById(R.id.btnNext)
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        // === Fungsi bantu: klik pada card menampilkan toast ===
        fun setCardClick(cardId: Int, namaMakanan: String) {
            findViewById<CardView>(cardId).setOnClickListener {
                makanan = namaMakanan
                Toast.makeText(this, "Anda memilih $makanan", Toast.LENGTH_SHORT).show()
            }
        }

        fun setCardClick(cardId: Int, namaMakanan: String, gambarMakanan: Int) {
            findViewById<CardView>(cardId).setOnClickListener {
                makanan = namaMakanan
                val intent = Intent(this, OrderActivity::class.java)
                intent.putExtra("makanan", namaMakanan)
                intent.putExtra("gambar", gambarMakanan)
                intent.putExtra("username", username)
                Toast.makeText(this, "Anda memilih $namaMakanan", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }


        // === Pasang listener ke tiap CardView ===
        setCardClick(R.id.card_donut, "Donut")
        setCardClick(R.id.card_ice_cream, "Ice Cream")
        setCardClick(R.id.card_froyo, "Froyo")
        setCardClick(R.id.card_bubur_ayam, "Bubur Ayam")
        setCardClick(R.id.card_pizza, "Pizza")
        setCardClick(R.id.card_burger, "Burger")
        setCardClick(R.id.card_sushi, "Sushi")
        setCardClick(R.id.card_pasta, "Pasta")
        setCardClick(R.id.card_salad, "Salad")

        // Tombol lanjut
        btnNext!!.setOnClickListener {
            if (makanan.isNullOrEmpty()) {
                Toast.makeText(this, "Pilih salah satu makanan dulu!", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this, OrderActivity::class.java)
                i.putExtra("username", username)
                i.putExtra("makanan", makanan)
                startActivity(i)
            }
        }



        // Navigasi bawah
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(this, "Anda berada di Home", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.nav_order -> {
                    startActivity(Intent(this, OrderActivity::class.java))
                    true
                }

                R.id.nav_profile -> {
                    // Nanti bisa diarahkan ke ProfileActivity
                    true
                }

                else -> false
            }
        }
    }
}
