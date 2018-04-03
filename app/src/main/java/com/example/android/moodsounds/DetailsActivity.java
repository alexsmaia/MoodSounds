package com.example.android.moodsounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    // Global Variable Music object.
    private Music music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get intent
        Bundle musicItem = getIntent().getExtras();
        // Get Music object class from intent
        music = (Music) musicItem.getParcelable("musicItem");

        // Get & Add Title to TextView
        TextView detailsMusicTitle = (TextView) findViewById(R.id.detailsMusicTitle);
        detailsMusicTitle.setText(music.getMusicTitle());

    }

    // Change the Top Back Botton
    // (Code get from youtube tutorial https://www.youtube.com/watch?v=suWIljV1AxI)
    private Intent getParentActivityIntentImplement() {
        // Get the mood
        String backActivity = music.getMusicMood();
        if (backActivity.equals("angry")) {
            Intent intent = new Intent(this, AngryActivity.class);
        } else {
            Intent intent = new Intent(this, MainActivity.class);
        }
        Intent intent = new Intent(this, AngryActivity.class);
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
