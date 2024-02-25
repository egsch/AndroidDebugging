package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class PrintListActivity : AppCompatActivity() {

    private val wordList: TextView get() = findViewById(R.id.word_list)
    private var words = listOf(
        "this",
        "is",
        "your",
        "standard",
        "immutable",
        "list"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_list)

        wordList.text = combinedWords()
    }

    private fun combinedWords(): String {
        var combined = ""
        // Since we're starting at zero, we need to stop BEFORE we get to words.size!
        // so we take out the "+ 1"
        for (idx in 0 until words.size) {
            combined += "${words[idx]}\n"
        }
        return combined
    }
}