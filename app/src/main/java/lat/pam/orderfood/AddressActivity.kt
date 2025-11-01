package lat.pam.orderfood

import lat.pam.orderfood.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class AddressActivity : AppCompatActivity() {
    var etNama: EditText? = null
    var etAlamat: EditText? = null
    var etPatokan: EditText? = null
    var btnOrder: Button? = null
    var username: String? = null
    var makanan: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        etNama = findViewById<EditText?>(R.id.etNama)
        etAlamat = findViewById<EditText?>(R.id.etAlamat)
        etPatokan = findViewById<EditText?>(R.id.etAlamatLengkap)
        btnOrder = findViewById<Button?>(R.id.btnOrder)

        makanan = getIntent().getStringExtra("makanan")
        username = getIntent().getStringExtra("username")

        btnOrder!!.setOnClickListener(View.OnClickListener { v: View? ->
            val i = Intent(this, ConfirmationActivity::class.java)
            i.putExtra("username", username)
            i.putExtra("makanan", makanan)
            startActivity(i)
        })
    }
}
