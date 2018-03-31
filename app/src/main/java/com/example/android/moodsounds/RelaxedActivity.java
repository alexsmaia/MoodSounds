package com.example.android.moodsounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class RelaxedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Find Root view
        LinearLayout musicListBox = (LinearLayout) findViewById(R.id.musicListBox);
        // Change Background
        musicListBox.setBackgroundResource(R.color.relaxed);
    }
}
