package com.example.android.moodsounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Angry view
        TextView angry = (TextView) findViewById(R.id.angry);
        // Set click listener on Angry View
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link Angryctivity}
                Intent AngryIntent = new Intent(MainActivity.this, AngryActivity.class);
                // Start the activity
                startActivity(AngryIntent);
            }
        });

        // Find Calm view
        TextView calm = (TextView) findViewById(R.id.calm);
        // Set click listener on Calm View
        calm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link CalmActivity}
                Intent CalmIntent = new Intent(MainActivity.this, CalmActivity.class);
                // Start the activity
                startActivity(CalmIntent);
            }
        });

        // Find Energetic view
        TextView energetic = (TextView) findViewById(R.id.energetic);
        // Set click listener on Energetic View
        energetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link EnergeticActivity}
                Intent EnergeticIntent = new Intent(MainActivity.this, EnergeticActivity.class);
                // Start the activity
                startActivity(EnergeticIntent);
            }
        });

        // Find Grumpy view
        TextView grumpy = (TextView) findViewById(R.id.grumpy);
        // Set click listener on Grumpy View
        grumpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link GrumpyActivity}
                Intent GrumpyIntent = new Intent(MainActivity.this, GrumpyActivity.class);
                // Start the activity
                startActivity(GrumpyIntent);
            }
        });

        // Find Happy view
        TextView happy = (TextView) findViewById(R.id.happy);
        // Set click listener on Calm View
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link HappyActivity}
                Intent HappyIntent = new Intent(MainActivity.this, HappyActivity.class);
                // Start the activity
                startActivity(HappyIntent);
            }
        });

        // Find Relaxed view
        TextView relaxed = (TextView) findViewById(R.id.relaxed);
        // Set click listener on Relaxed View
        relaxed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link RelaxedActivity}
                Intent RelaxedIntent = new Intent(MainActivity.this, RelaxedActivity.class);
                // Start the activity
                startActivity(RelaxedIntent);
            }
        });

        // Find Romantic view
        TextView romantic = (TextView) findViewById(R.id.romantic);
        // Set click listener on Romantic View
        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link RomanticActivity}
                Intent RomanticIntent = new Intent(MainActivity.this, RomanticActivity.class);
                // Start the activity
                startActivity(RomanticIntent);
            }
        });

        // Find Sad view
        TextView sad = (TextView) findViewById(R.id.sad);
        // Set click listener on Sad View
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open {@link SadActivity}
                Intent SadIntent = new Intent(MainActivity.this, SadActivity.class);
                // Start the activity
                startActivity(SadIntent);
            }
        });
    }
}
