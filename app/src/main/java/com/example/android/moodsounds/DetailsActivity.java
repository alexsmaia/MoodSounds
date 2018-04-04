package com.example.android.moodsounds;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    // Global Variable Witch Activity to go Back
    public String backActivity;

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


        // Get & Add Title to TextView
        TextView detailsMusicTitle = (TextView) findViewById(R.id.detailsMusicTitle);
        detailsMusicTitle.setText(music.getMusicTitle());

    }

    // Change the Top Back Botton
    // (Code get from youtube tutorial https://www.youtube.com/watch?v=suWIljV1AxI)
    private Intent getParentActivityIntentImplement() {

        // Get the mood
        Intent intent;
        if (backActivity.equals("Angry")) {
            intent = new Intent(this, AngryActivity.class);
        } else  if (backActivity.equals("Calm")) {
            intent = new Intent(this, CalmActivity.class);
        } else {
            intent = new Intent(this, MainActivity.class);
        }
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
