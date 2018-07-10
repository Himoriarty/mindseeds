package com.mind.moriarty.mindseeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GrowUpActivity extends AppCompatActivity {

    private ImageButton mShowDetailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grow_up);

       mShowDetailButton = (ImageButton)findViewById(R.id.show_detail_button);
       mShowDetailButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // start EEG detail activity
               Intent i = new Intent(GrowUpActivity.this, EegDetailActivity.class);
               startActivity(i);
           }
       });
    }
}
