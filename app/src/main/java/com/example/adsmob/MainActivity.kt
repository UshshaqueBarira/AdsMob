package com.example.adsmob
import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var mAdView: AdView? = null

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAdView = findViewById(R.id.adView)
        val adRequest =
            AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }
}