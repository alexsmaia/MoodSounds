package com.example.android.moodsounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AngryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Find Root view
        ListView musicList = (ListView) findViewById(R.id.musicList);
        // Change Background
        musicList.setBackgroundResource(R.color.angry);

        // Create ArrayList of Musics
        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music(
                "Welcome to the Jungle",
                "Guns N' Roses",
                "4:32",
                "Angry"));
        musics.add(new Music(
                "Master of Puppets",
                "Metallica",
                "8:38",
                "Angry"));
        musics.add(new Music(
                "Battery",
                "Metallica",
                "5:10",
                "Angry"));
        musics.add(new Music(
                "Holidays in the Sun",
                "Sex Pistols",
                "3:22",
                "Angry"));
        musics.add(new Music(
                "New York",
                "Sex Pistols",
                "3:05",
                "Angry"));
        musics.add(new Music(
                "The Fight Song",
                "Marilyn Manson",
                "2:55",
                "Angry"));
        musics.add(new Music(
                "Disposable Teens",
                "Marilyn Manson",
                "3:01",
                "Angry"));
        musics.add(new Music(
                "The Death Song",
                "Marilyn Manson",
                "3:29",
                "Angry"));
        musics.add(new Music(
                "Counterfeit",
                "Limp Bizkit",
                "5:08",
                "Angry"));
        musics.add(new Music(
                "Leech",
                "Limp Bizkit",
                "2:11",
                "Angry"));
        musics.add(new Music(
                "Nitro (Youth Energy)",
                "The Offspring",
                "2:26",
                "Angry"));
        musics.add(new Music(
                "Killboy Powerhead",
                "The Offspring",
                "2:02",
                "Angry"));

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
                Intent DetailsIntent = new Intent(AngryActivity.this, DetailsActivity.class);
                // Add Music Item Object to Intent
                DetailsIntent.putExtra("musicItem", musicItem);
                // Start the activity
                startActivity(DetailsIntent);
            }
        });
    }
}
