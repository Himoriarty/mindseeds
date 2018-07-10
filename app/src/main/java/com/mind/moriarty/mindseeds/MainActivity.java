package com.mind.moriarty.mindseeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton mPlantZooButton;
    private ImageButton mGrowUpButton;
    private ImageButton mGameModeButton;
    private ImageButton mSeedsStoreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlantZooButton = (ImageButton)findViewById(R.id.plant_zoo_button);
        mPlantZooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start plant zoo activity
                Intent i = new Intent(MainActivity.this, PlantZooActivity.class);
                startActivity(i);
            }
        });

        mGrowUpButton = (ImageButton)findViewById(R.id.grow_up_button);
        mGrowUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start grow up activity
                Intent i = new Intent(MainActivity.this, GrowUpActivity.class);
                startActivity(i);
            }
        });

        mGameModeButton = (ImageButton)findViewById(R.id.game_mode_button);
        mGameModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start game mode activity
                Intent i = new Intent(MainActivity.this, GameModeActivity.class);
                startActivity(i);
            }
        });

        mSeedsStoreButton = (ImageButton)findViewById(R.id.seeds_store_button);
        mSeedsStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start seeds store activity
                Intent i = new Intent(MainActivity.this, SeedsStoreActivity.class);
                startActivity(i);
            }
        });
    }
}
