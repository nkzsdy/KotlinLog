package jp.techacademy.ryota.kotlinlog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 25, "睡眠")
        val human2 = Human("鈴木", 35, "散歩")

        human1.say()
        human2.think()
    }
}
