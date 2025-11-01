package lat.pam.orderfood

import lat.pam.orderfood.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnStart = findViewById<Button?>(R.id.btnStart)
        btnStart.setOnClickListener(View.OnClickListener { v: View? ->
            startActivity(
                Intent(
                    this,
                    WelcomeActivity::class.java
                )
            )
        }
        )
    }
}
