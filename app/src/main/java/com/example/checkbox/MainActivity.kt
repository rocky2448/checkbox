package com.example.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var checkboxTextTV: TextView
    private lateinit var checkboxTextCB: CheckBox
    private lateinit var rulesPDDTextTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        checkboxTextTV = findViewById(R.id.checkboxTextTV)
        checkboxTextCB = findViewById(R.id.checkboxTextCB)
        rulesPDDTextTV = findViewById(R.id.rulesPDDTextTV)

        checkboxTextCB.setOnCheckedChangeListener { buttonView, isCheked ->
            if (isCheked) {
                checkboxTextTV.text = "Правила дорожного движения"
                rulesPDDTextTV.setText(R.string.text_rules)
            }
            else {
                checkboxTextTV.text = "Информация"
                rulesPDDTextTV.text = ""
            }
        }
    }


}