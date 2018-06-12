package com.example.hp.snakesandladder;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int [] myDices = {
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six,
};

    public void rollTapped(View view){
        Log.i("button" , "ButtonTapped");
        Random random = new Random();
        int RanGenerated=  random.nextInt(6) ;
        Log.i("Random" , "Random number is " + RanGenerated);


        ImageView dice = (ImageView) findViewById(R.id.dice);
        dice.setImageResource(myDices[RanGenerated]);

            dice.animate().rotation(360).rotationX(360);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
