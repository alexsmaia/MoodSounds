package com.example.android.moodsounds;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    // Global Variable Witch Activity to go Back
    private String backActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get intent
        Bundle musicItem = getIntent().getExtras();
        // Get Music object class from intent
        Music music = (Music) musicItem.getParcelable("musicItem");

        // Get the mood
        backActivity = music.getMusicMood();

        // Find Root view
        LinearLayout rootView = (LinearLayout) findViewById(R.id.detailsRoot);
        // Change Background
        if (backActivity.equals("Angry")) {
            rootView.setBackgroundResource(R.color.angry);
        } else if (backActivity.equals("Calm")) {
            rootView.setBackgroundResource(R.color.calm);
        } else if (backActivity.equals("Energetic")) {
            rootView.setBackgroundResource(R.color.energetic);
        } else if (backActivity.equals("Grumpy")) {
            rootView.setBackgroundResource(R.color.grumpy);
        } else if (backActivity.equals("Happy")) {
            rootView.setBackgroundResource(R.color.happy);
        } else if (backActivity.equals("Relaxed")) {
            rootView.setBackgroundResource(R.color.relaxed);
        } else if (backActivity.equals("Romantic")) {
            rootView.setBackgroundResource(R.color.romantic);
        } else if (backActivity.equals("Sad")) {
            rootView.setBackgroundResource(R.color.sad);
        }

        // Get & Add Title to TextView
        TextView detailsMusicTitle = (TextView) findViewById(R.id.detailsMusicTitle);
        detailsMusicTitle.setText(music.getMusicTitle());

        // Get & Add Title to TextView
        TextView detailsMusicAuthor = (TextView) findViewById(R.id.detailsMusicAuthor);
        detailsMusicAuthor.setText(music.getMusicAuthor());

        // Get & Add Title to TextView
        TextView detailsMusicDuration = (TextView) findViewById(R.id.detailsMusicDuration);
        detailsMusicDuration.setText(music.getMusicDuration());

        // Get & Add Listener to Button Mood Change
        Button btnMoodChange = (Button) findViewById(R.id.moodChange);
        btnMoodChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Mood to Intent
                Intent ActivityIntent = new Intent(DetailsActivity.this, MainActivity.class);
                // Start the activity
                startActivity(ActivityIntent);
            }
        });


    }

    // Change the Top Back Botton
    // (Code get from youtube tutorial https://www.youtube.com/watch?v=suWIljV1AxI)
    private Intent getParentActivityIntentImplement() {

        // Get the mood
        Intent intent = new Intent(this, MoodActivity.class);
        intent.putExtra("mood", "Angry");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;

    }

    @Override
    public Intent getSupportParentActivityIntent() {
        return getParentActivityIntentImplement();
    }

    @Override
    public Intent getParentActivityIntent() {
        return getParentActivityIntentImplement();
    }
}
