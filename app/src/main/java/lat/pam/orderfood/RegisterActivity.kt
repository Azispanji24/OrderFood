package lat.pam.orderfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    var etNama: EditText? = null
    var etUsername: EditText? = null
    var etPassword: EditText? = null
    var btnRegister: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etNama = findViewById<EditText?>(R.id.etNamaLengkap)
        etUsername = findViewById<EditText?>(R.id.etUsername)
        etPassword = findViewById<EditText?>(R.id.etPassword)
        btnRegister = findViewById<Button?>(R.id.btnRegister)

        btnRegister!!.setOnClickListener(View.OnClickListener { v: View? ->
            val nama = etNama!!.getText().toString()
            if (!nama.isEmpty()) {
                val i = Intent(this, HomeActivity::class.java)
                i.putExtra("username", nama)
                startActivity(i)
            } else {
                Toast.makeText(this, "Isi semua data!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
