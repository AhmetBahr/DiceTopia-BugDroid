package com.example.kotlinuygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var altiliZar:Button = findViewById(R.id.altiliZar)
        var dortluZar:Button = findViewById(R.id.dortluZar)
        var ikiliZar:Button = findViewById(R.id.ikiliZar)
        var sekizliZar:Button = findViewById(R.id.sekizliZar)
        var onluZar:Button = findViewById(R.id.onluZar)
        var onikiliZar:Button = findViewById(R.id.onikiliZar)
        var yirmiliZar:Button = findViewById(R.id.yirmiliZar)

        var  ZarText:TextView = findViewById(R.id.ZarTe)
        var  ZarName:TextView = findViewById(R.id.ZarName)


        altiliZar.setOnClickListener{

            var Rand = (1..6).random()

            ZarName.text = "d6"
            ZarText.text = Rand.toString()

        }

        dortluZar.setOnClickListener{

            var Rand = (1..4).random()
            ZarName.text = "d4"
            ZarText.text = Rand.toString()

        }
        ikiliZar.setOnClickListener{

            var Rand = (1..2).random()
            ZarName.text = "d2"
            ZarText.text = Rand.toString()

        }

        sekizliZar.setOnClickListener{

            var Rand = (1..8).random()
            ZarName.text = "d8"
            ZarText.text = Rand.toString()

        }
        onluZar.setOnClickListener{

            var Rand = (1..10).random()
            ZarName.text = "d10"
            ZarText.text = Rand.toString()

        }
        onikiliZar.setOnClickListener{

            var Rand = (1..12).random()
            ZarName.text = "d12"
            ZarText.text = Rand.toString()

        }
        yirmiliZar.setOnClickListener{

            var Rand = (1..20).random()
            ZarName.text = "d20"
            ZarText.text = Rand.toString()

        }







    }
}