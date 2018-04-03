package com.example.android.moodsounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class RomanticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Find Root view
        ListView musicList = (ListView) findViewById(R.id.musicList);
        // Change Background
        musicList.setBackgroundResource(R.color.romantic);
    }
}
