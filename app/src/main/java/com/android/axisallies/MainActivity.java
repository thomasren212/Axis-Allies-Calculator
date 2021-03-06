package com.android.axisallies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the Buttons
        final Button btRegularOnLand = (Button) findViewById(R.id.btRegularOnLand);
        final Button btRegularOnSea = (Button) findViewById(R.id.btRegularOnSea);
        final Button btAmphibious = (Button) findViewById(R.id.btAmphibious);
        final Button btConvoy = (Button) findViewById(R.id.btConvoy);
        final Button btBombing = (Button) findViewById(R.id.btBombing);

        btRegularOnLand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on click
                // Go to Regular Battle Activity
                startActivity(new Intent(MainActivity.this, RegularOnLandActivity.class));
            }
        });

        btConvoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on click
                // Go to Convoy Disruption Activity
                startActivity(new Intent(MainActivity.this, ConvoyActivity.class));
            }
        });
    }
}
