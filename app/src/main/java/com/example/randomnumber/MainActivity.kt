package com.example.randomnumber
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.generate_button)
        button.setOnClickListener {
            onClick() // Вызов функции onClick() при нажатии на кнопку
        }
    }

    private fun onClick() {
        val editText1 = findViewById<EditText>(R.id.edit_text1)
        val userInput1 = editText1.text.toString()
        val editText2 = findViewById<EditText>(R.id.edit_text2)
        val userInput2 = editText2.text.toString()
        if (userInput1.isNotEmpty()) {
            if (userInput2.isNotEmpty()) {
                val generator = Generator(userInput1, userInput2)
                val check = generator.checkRequire()
                if (check){
                    val result = generator.generate()
                    val resultText = findViewById<TextView>(R.id.result_text)
                    resultText.text = result.toString() // Установка результата в TextView
                }
                else {
                    Toast.makeText(this, "x должен быть меньше или равен y!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Введите y", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Введите x", Toast.LENGTH_SHORT).show()
        }
    }
}