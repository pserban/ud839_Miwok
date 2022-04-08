package com.example.android.miwok;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private static String TAG = "NumbersActivity";

    ArrayList<String> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        words = new ArrayList<>(asList("one", "two", "three",
                "four", "five", "six", "seven", "eight", "nine", "ten"));

        LinearLayout rootView = findViewById(R.id.rootView);

        int index = 0;
        while (index < 10) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            index += 1;
        }
    }

}