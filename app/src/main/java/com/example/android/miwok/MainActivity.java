/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);

        // Set a clickListener on that View
        numbers.setOnClickListener(view -> {
            // Create a new intent to open the {@link Numbers Activity}
            Intent intent = new Intent(MainActivity.this, NumbersActivity.class);

            // Start the new activity
            startActivity(intent);
        });

        // Find the View that shows the Colors category
        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(intent);
        });

        // Find the View that shows the Phrases category
        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(intent);
        });

        // Find the View that shows the Family category
        TextView family = findViewById(R.id.family);
        family.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(intent);
        });
    }

}
