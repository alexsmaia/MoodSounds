package com.example.android.moodsounds;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CalmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Find Root view
        ListView musicList = (ListView) findViewById(R.id.musicList);
        // Change Background
        musicList.setBackgroundResource(R.color.calm);

        // Create ArrayList of Musics
        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music(
                "Shades of Cool",
                "Lana Del Rey",
                "5:42",
                "Calm"));
        musics.add(new Music(
                "Old Money",
                "Lana Del Rey",
                "4:31",
                "Calm"));
        musics.add(new Music(
                "Money Power Glory",
                "Lana Del Rey",
                "4:30",
                "Calm"));
        musics.add(new Music(
                "Shake It Out",
                "Florence + the Machine",
                "4:37",
                "Calm"));
        musics.add(new Music(
                "Never Let Me Go",
                "Florence + the Machine",
                "4:31",
                "Calm"));
        musics.add(new Music(
                "Leave My Body",
                "Florence + the Machine",
                "4:26",
                "Calm"));
        musics.add(new Music(
                "Stay Here Forever",
                "Jewel",
                "2:59",
                "Calm"));
        musics.add(new Music(
                "What You Are",
                "Jewel",
                "3:40",
                "Calm"));

        // Create list TextViews for musics
        MusicAdapter adapter = new MusicAdapter(this, musics);
        musicList.setAdapter(adapter);

        // Set List Item Listener
        musicList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get Click Music
                Music musicItem = musics.get(i);
                // Create intent to open {@link DetailsActivity}
                Intent DetailsIntent = new Intent(CalmActivity.this, DetailsActivity.class);
                // Add Music Item Object to Intent
                DetailsIntent.putExtra("musicItem", musicItem);
                // Start the activity
                startActivity(DetailsIntent);
            }
        });
    }
}
