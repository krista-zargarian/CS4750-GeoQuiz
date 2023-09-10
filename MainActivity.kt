package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import android.view.View

// import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            // Do something in response to the click here
            showSnackbar(getString(R.string.correct_toast))
        }
        falseButton.setOnClickListener {
            // Do something in response to the click here
            showSnackbar(getString(R.string.incorrect_toast))
        }

    }

    private fun showSnackbar(string: String) {
        val rootView = findViewById<View>(android.R.id.content)
        val snackbar = Snackbar.make(rootView, string, Snackbar.LENGTH_SHORT)

        // You can customize the Snackbar here if needed
        snackbar.setAction("Action", View.OnClickListener {
            // Handle the action button click if needed
        })

        snackbar.show()

    }
}
