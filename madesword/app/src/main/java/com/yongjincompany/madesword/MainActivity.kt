package com.yongjincompany.madesword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Madesword)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}