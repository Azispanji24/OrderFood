package lat.pam.orderfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    var etUsername: EditText? = null
    var etPassword: EditText? = null
    var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById<EditText?>(R.id.etUsername)
        etPassword = findViewById<EditText?>(R.id.etPassword)
        btnLogin = findViewById<Button?>(R.id.btnLogin)

        btnLogin!!.setOnClickListener(View.OnClickListener { v: View? ->
            val user = etUsername!!.getText().toString()
            if (!user.isEmpty()) {
                val i = Intent(this, HomeActivity::class.java)
                i.putExtra("username", user)
                startActivity(i)
            } else {
                Toast.makeText(this, "Isi username dulu!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
