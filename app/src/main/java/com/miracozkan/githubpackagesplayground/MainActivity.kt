package com.miracozkan.githubpackagesplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.miracozkan.firstlib.MyLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorld = MyLib.sayHello()
    }
}
