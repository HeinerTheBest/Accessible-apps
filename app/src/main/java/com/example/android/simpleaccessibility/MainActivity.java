/*
 * Copyright (C) 2017 Google Inc.
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
package com.example.android.simpleaccessibility;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Main activity.  All the functionality of this sample is in
 * res/layout/activity_main.xml.
 */
public class MainActivity extends AppCompatActivity {
    ImageView button;
    boolean trash = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_image);
    }

    public void onClick(View view)
    {
        if(trash)
        {
            button.setContentDescription(getResources().getString(R.string.lock));
            button.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_lock_lock));
            trash = false;
        }
        else
        {
            button.setContentDescription(getResources().getString(R.string.discard));
            button.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_action_discard));
            trash = true;
        }
    }

}
