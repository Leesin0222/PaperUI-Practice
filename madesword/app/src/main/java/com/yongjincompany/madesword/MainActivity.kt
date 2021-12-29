package com.yongjincompany.madesword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.yongjincompany.madesword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim)}
    private val rotateClose: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_close_anim)}
    private val fromBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.from_bottom_anim)}
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.to_bottom_anim)}

    private lateinit var binding:ActivityMainBinding

    private var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Madesword)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            onMenuButtonClicked()
        }

        binding.shop.setOnClickListener {

        }

        binding.setting.setOnClickListener {

        }
    }




    private fun onMenuButtonClicked() {
        setVisibility(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }


    private fun setAnimation(clicked: Boolean){
        if(!clicked){
            binding.setting.visibility = View.VISIBLE
            binding.shop.visibility = View.VISIBLE
        }else{
            binding.setting.visibility = View.INVISIBLE
            binding.shop.visibility = View.INVISIBLE
        }
    }

    private fun setVisibility(clicked: Boolean) {
        if(!clicked){
            binding.setting.startAnimation(fromBottom)
            binding.shop.startAnimation(fromBottom)
            binding.menuBtn.startAnimation(rotateOpen)
        }else{
            binding.setting.startAnimation(toBottom)
            binding.shop.startAnimation(toBottom)
            binding.menuBtn.startAnimation(rotateClose)
        }
    }
}