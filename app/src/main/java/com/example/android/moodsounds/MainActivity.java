package com.example.android.moodsounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create intent to open {@link MoodActivity}
        final Intent MoodIntent = new Intent(MainActivity.this, MoodActivity.class);

        // Find Angry view
        TextView angry = (TextView) findViewById(R.id.angry);
        // Set click listener on Angry View
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Angry");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Calm view
        TextView calm = (TextView) findViewById(R.id.calm);
        // Set click listener on Calm View
        calm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Calm");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Energetic view
        TextView energetic = (TextView) findViewById(R.id.energetic);
        // Set click listener on Energetic View
        energetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Energetic");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Grumpy view
        TextView grumpy = (TextView) findViewById(R.id.grumpy);
        // Set click listener on Grumpy View
        grumpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Grumpy");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Happy view
        TextView happy = (TextView) findViewById(R.id.happy);
        // Set click listener on Calm View
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Happy");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Relaxed view
        TextView relaxed = (TextView) findViewById(R.id.relaxed);
        // Set click listener on Relaxed View
        relaxed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Relaxed");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Romantic view
        TextView romantic = (TextView) findViewById(R.id.romantic);
        // Set click listener on Romantic View
        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Romantic");
                // Start the activity
                startActivity(MoodIntent);
            }
        });

        // Find Sad view
        TextView sad = (TextView) findViewById(R.id.sad);
        // Set click listener on Sad View
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                MoodIntent.putExtra("mood", "Sad");
                // Start the activity
                startActivity(MoodIntent);
            }
        });
    }
}