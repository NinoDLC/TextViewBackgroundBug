package fr.delcey.textviewbackgroundbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        main_button_shrink.setOnClickListener {
            main_textview.text = "Hello !"
        }

        main_button_expand.setOnClickListener {
            main_textview.text = "Hello my big big World !"
        }
    }
}