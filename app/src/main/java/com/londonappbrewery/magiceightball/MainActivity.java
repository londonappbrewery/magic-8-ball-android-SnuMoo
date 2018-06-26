package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button rollbutton;
        rollbutton = (Button) findViewById(R.id.rollvalabutton);

        final ImageView BallResult = findViewById(R.id.ball8);

        final int[] resArray = {
                R.drawable.res1,
                R.drawable.res2,
                R.drawable.res3,
                R.drawable.res4,
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);

                BallResult.setImageResource(resArray[number]);
            }
        });


    }
}
