package com.android.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.food = FoodList(1,
                                "Elma",
                                100,
                        "https://user-images.githubusercontent.com/57728209/152476449-aeb0e337-f1cc-4499-bb39-0ad2f69b2963.jpg")
    }
}






