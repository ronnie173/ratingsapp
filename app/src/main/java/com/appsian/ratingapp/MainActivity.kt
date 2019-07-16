package com.appsian.ratingapp

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var answerValue = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        titlerate.typeface = Typeface.createFromAsset(assets, "fonts/mr.ttf")
        resultRate.typeface = Typeface.createFromAsset(assets, "fonts/mm.ttf")
        btnFeedBack.typeface = Typeface.createFromAsset(assets, "fonts/mm.ttf")

        rateStars.setOnRatingBarChangeListener { ratingBar, fl, b ->
            answerValue = rateStars.rating.toString()
            when (answerValue) {
                "1.0" -> charPlace.setImageResource(R.drawable.iconestar)
                "2.0" -> charPlace.setImageResource(R.drawable.iconestar)
                "3.0" -> charPlace.setImageResource(R.drawable.icthreestar)
                "4.0" -> charPlace.setImageResource(R.drawable.icthreestar)
                "5.0" -> charPlace.setImageResource(R.drawable.icfivestar)
                else -> {
                    Toast.makeText(applicationContext,"No Point",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
