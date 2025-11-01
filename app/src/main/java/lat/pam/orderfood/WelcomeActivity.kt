package lat.pam.orderfood

import lat.pam.orderfood.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        findViewById<View?>(R.id.btnRegister).setOnClickListener(View.OnClickListener { v: View? ->
            startActivity(
                Intent(this, RegisterActivity::class.java)
            )
        })

        findViewById<View?>(R.id.btnLogin).setOnClickListener(View.OnClickListener { v: View? ->
            startActivity(
                Intent(this, LoginActivity::class.java)
            )
        })
    }
}
