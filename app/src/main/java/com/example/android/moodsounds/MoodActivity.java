package com.example.android.moodsounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MoodActivity extends AppCompatActivity {

    private String mood = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Get Intent
        Bundle MoodIntent = getIntent().getExtras();
        mood = MoodIntent.getString("mood");
        // Find Root view
        ListView musicList = (ListView) findViewById(R.id.musicList);

        // Create ArrayList of Musics
        final ArrayList<Music> musics = new ArrayList<Music>();

        // Change Color and add musics to moods
        switch (mood) {
            case "Angry":
                // Change Background
                musicList.setBackgroundResource(R.color.angry);
                // Add Musics to Array List
                musics.add(new Music(
                        getResources().getString(R.string.angry_m01_song),
                        getResources().getString(R.string.angry_m01_artist),
                        getResources().getString(R.string.angry_m01_time),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m02_song),
                        getResources().getString(R.string.angry_m02_artist),
                        getResources().getString(R.string.angry_m02_time),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m03_song),
                        getResources().getString(R.string.angry_m02_artist),
                        getResources().getString(R.string.angry_m03_time),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m04_song),
                        getResources().getString(R.string.angry_m04_artist),
                        getResources().getString(R.string.angry_m04_time),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m05_song),
                        getResources().getString(R.string.angry_m04_artist),
                        getResources().getString(R.string.angry_m05_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m06_song),
                        getResources().getString(R.string.angry_m06_artist),
                        getResources().getString(R.string.angry_m06_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m07_song),
                        getResources().getString(R.string.angry_m06_artist),
                        getResources().getString(R.string.angry_m07_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m08_song),
                        getResources().getString(R.string.angry_m06_artist),
                        getResources().getString(R.string.angry_m08_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m09_song),
                        getResources().getString(R.string.angry_m09_artist),
                        getResources().getString(R.string.angry_m09_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m10_song),
                        getResources().getString(R.string.angry_m09_artist),
                        getResources().getString(R.string.angry_m10_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m11_song),
                        getResources().getString(R.string.angry_m11_artist),
                        getResources().getString(R.string.angry_m11_song),
                        getResources().getString(R.string.angry)));
                musics.add(new Music(
                        getResources().getString(R.string.angry_m12_song),
                        getResources().getString(R.string.angry_m11_artist),
                        getResources().getString(R.string.angry_m12_song),
                        getResources().getString(R.string.angry)));
                break;
            case "Calm":
                // Change Background
                musicList.setBackgroundResource(R.color.calm);
                // Add Musics to Array List
                musics.add(new Music(
                        getResources().getString(R.string.calm_m01_song),
                        getResources().getString(R.string.calm_m01_artist),
                        getResources().getString(R.string.calm_m01_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m02_song),
                        getResources().getString(R.string.calm_m01_artist),
                        getResources().getString(R.string.calm_m02_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m03_song),
                        getResources().getString(R.string.calm_m01_artist),
                        getResources().getString(R.string.calm_m03_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m04_song),
                        getResources().getString(R.string.calm_m04_artist),
                        getResources().getString(R.string.calm_m04_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m05_song),
                        getResources().getString(R.string.calm_m04_artist),
                        getResources().getString(R.string.calm_m05_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m06_song),
                        getResources().getString(R.string.calm_m04_artist),
                        getResources().getString(R.string.calm_m06_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m07_song),
                        getResources().getString(R.string.calm_m07_artist),
                        getResources().getString(R.string.calm_m07_time),
                        getResources().getString(R.string.calm)));
                musics.add(new Music(
                        getResources().getString(R.string.calm_m08_song),
                        getResources().getString(R.string.calm_m07_artist),
                        getResources().getString(R.string.calm_m08_time),
                        getResources().getString(R.string.calm)));
                break;
            case "Energetic":
                // Change Background
                musicList.setBackgroundResource(R.color.energetic);
                // Add Musics to Array List
                musics.add(new Music(
                        "Eye of the Tiger",
                        "Survivor",
                        "4:05",
                        "Energetic"));
                musics.add(new Music(
                        "We're Not Gonna Take It",
                        "Twisted Sister",
                        "3:39",
                        "Energetic"));
                musics.add(new Music(
                        "Jump - Remastered Version",
                        "Van Halen",
                        "4:04",
                        "Energetic"));
                musics.add(new Music(
                        "In the Heat of the Moment",
                        "Asia",
                        "3:51",
                        "Energetic"));
                musics.add(new Music(
                        "Lust For Life",
                        "Iggy Pop",
                        "5:13",
                        "Energetic"));
                musics.add(new Music(
                        "I Was Made For Lovin' You",
                        "Kiss",
                        "4:40",
                        "Energetic"));
                musics.add(new Music(
                        "Highway to Hell",
                        "AC/DC",
                        "3:28",
                        "Energetic"));
                musics.add(new Music(
                        "Vertigo",
                        "U2",
                        "3:13",
                        "Energetic"));
                break;
            case "Grumpy":
                // Change Background
                musicList.setBackgroundResource(R.color.grumpy);
                // Add Musics to Array List
                musics.add(new Music(
                        "Stop This Train",
                        "John Mayer",
                        "4:45",
                        "Grumpy"));
                musics.add(new Music(
                        "Don't Take It Personal (Just One Of Dem Days) ",
                        "Monica",
                        "4:18",
                        "Grumpy"));
                musics.add(new Music(
                        "Leech",
                        "Eve 6",
                        "3:58",
                        "Grumpy"));
                musics.add(new Music(
                        "Can't Get Enough",
                        "The Sweet Serenades",
                        "2:32",
                        "Grumpy"));
                musics.add(new Music(
                        "King",
                        "Years & Years",
                        "3:35",
                        "Grumpy"));
                musics.add(new Music(
                        "Huckleberry Finn",
                        "Solander",
                        "3:47",
                        "Grumpy"));
                musics.add(new Music(
                        "The Peasant",
                        "Hope Sandoval and the Warm Inventions",
                        "4:57",
                        "Grumpy"));
                break;
            case "Happy":
                // Change Background
                musicList.setBackgroundResource(R.color.happy);
                // Add Musics to Array List
                musics.add(new Music(
                        "Échame La Culpa",
                        "Luis Fonsi, Demi Lovato",
                        "2:53",
                        "Happy"));
                musics.add(new Music(
                        "Solo Dance",
                        "Martin Jensen",
                        "2:54",
                        "Happy"));
                musics.add(new Music(
                        "Mr Blue Sky",
                        "Electric Light Orchestra",
                        "3:42",
                        "Happy"));
                musics.add(new Music(
                        "Miracle",
                        "Kimbra",
                        "4:12",
                        "Happy"));
                musics.add(new Music(
                        "Power",
                        "Kanye West",
                        "1:42",
                        "Happy"));
                musics.add(new Music(
                        "Uptown Funk",
                        "Bruno Mars, Mark Ronson",
                        "4:30",
                        "Happy"));
                musics.add(new Music(
                        "Ugly Heart",
                        "G.R.L.",
                        "3:29",
                        "Happy"));
                musics.add(new Music(
                        "Dancing In The Moonlight",
                        "Toploader",
                        "3:45",
                        "Happy"));
                musics.add(new Music(
                        "Sunday Morning",
                        "Maroon 5",
                        "4:23",
                        "Happy"));
                break;
            case "Relaxed":
                // Change Background
                musicList.setBackgroundResource(R.color.relaxed);
                // Add Musics to Array List
                musics.add(new Music(
                        "Marconi Union",
                        "Weightless",
                        "8:08",
                        "Relaxed"));
                musics.add(new Music(
                        "Airstream",
                        "Electra",
                        "2:54",
                        "Relaxed"));
                musics.add(new Music(
                        "Mr Blue Sky",
                        "Electric Light Orchestra",
                        "6:14",
                        "Relaxed"));
                musics.add(new Music(
                        "DJ Shah",
                        "Mellomaniac (Chill Out Mix)",
                        "5:38",
                        "Relaxed"));
                musics.add(new Music(
                        "Enya",
                        "Watermark",
                        "2:26",
                        "Relaxed"));
                musics.add(new Music(
                        "Coldplay",
                        "Strawberry Swing",
                        "4:13",
                        "Relaxed"));
                musics.add(new Music(
                        "All Saints",
                        "Pure Shores",
                        "4:09",
                        "Relaxed"));
                musics.add(new Music(
                        "Adele",
                        "Someone Like You",
                        "4:44",
                        "Relaxed"));
                musics.add(new Music(
                        "Mozart",
                        "Canzonetta Sull’aria",
                        "3:29",
                        "Relaxed"));
                musics.add(new Music(
                        "Cafe Del Mar",
                        "We Can Fly",
                        "6:07",
                        "Relaxed"));
                break;
            case "Romantic":
                // Change Background
                musicList.setBackgroundResource(R.color.romantic);
                // Add Musics to Array List
                musics.add(new Music(
                        "Two Hearts Beat As One",
                        "U2",
                        "4:03",
                        "Romantic"));
                musics.add(new Music(
                        "In Your Eyes",
                        "Peter Gabriel",
                        "10:43",
                        "Romantic"));
                musics.add(new Music(
                        "Yellow",
                        "Coldplay",
                        "4:27",
                        "Romantic"));
                musics.add(new Music(
                        "Sweet, Sweet Baby (I'm Fallin)",
                        "Lone Justice",
                        "4:02",
                        "Romantic"));
                musics.add(new Music(
                        "Just Like Heaven",
                        "The Cure",
                        "3:33",
                        "Romantic"));
                musics.add(new Music(
                        "The Sweetest Thing",
                        "U2",
                        "3:05",
                        "Romantic"));
                musics.add(new Music(
                        "Jersey Girl",
                        "Bruce Springsteen",
                        "6:30",
                        "Romantic"));
                musics.add(new Music(
                        "Forever in My Life",
                        "Prince",
                        "3:31",
                        "Romantic"));
                musics.add(new Music(
                        "I Go to Sleep",
                        "The Pretenders",
                        "2:57",
                        "Romantic"));
                musics.add(new Music(
                        "Windswept",
                        "Bryan Ferry",
                        "5:34",
                        "Romantic"));
                musics.add(new Music(
                        "Come Away with Me",
                        "Norah Jones",
                        "3:18",
                        "Romantic"));
                break;
            case "Sad":
                // Change Background
                musicList.setBackgroundResource(R.color.sad);
                // Add Musics to Array List
                musics.add(new Music(
                        "Lies",
                        "Jane XO",
                        "3:49",
                        "Sad"));
                musics.add(new Music(
                        "In And Out of Love",
                        "ATB",
                        "3:39",
                        "Sad"));
                musics.add(new Music(
                        "Can't Sleep",
                        "Above & Beyond",
                        "4:40",
                        "Sad"));
                musics.add(new Music(
                        "This Moment",
                        "Nic Chagall ft. Jonathan Mendelsohn",
                        "4:40",
                        "Sad"));
                musics.add(new Music(
                        "Say Something",
                        "Fort Romeau",
                        "3:54",
                        "Sad"));
                musics.add(new Music(
                        "Goodbye to a World",
                        "Porter Robinson",
                        "5:28",
                        "Sad"));
                musics.add(new Music(
                        "Together",
                        "Tourist",
                        "6:16",
                        "Sad"));
                break;
        }

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
                Intent DetailsIntent = new Intent(MoodActivity.this, DetailsActivity.class);
                // Add Music Item Object to Intent
                DetailsIntent.putExtra("musicItem", musicItem);
                // Start the activity
                startActivity(DetailsIntent);
            }
        });
    }
}