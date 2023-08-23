package br.com.povengenharia

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnglish = findViewById<ImageButton>(R.id.btnEnglish)
        val btnPortuguese = findViewById<ImageButton>(R.id.btnPortuguese)
        val btnSpanish = findViewById<ImageButton>(R.id.btnSpanish)

        btnEnglish.setOnClickListener { setLocale("en") }
        btnPortuguese.setOnClickListener { setLocale("pt") }
        btnSpanish.setOnClickListener { setLocale("es") }
    }

    private fun setLocale(selectedLanguage: String) {
        val locale = Locale(selectedLanguage)
        val config = Configuration(resources.configuration)
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
        recreate()
    }

}





