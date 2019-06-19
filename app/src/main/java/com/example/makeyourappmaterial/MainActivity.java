package com.example.makeyourappmaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton floatingActionButton;
    ImageButton imageButton;
    TextView tv_newFont;
    ImageView img_animation_example;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.fab);
        imageButton = findViewById(R.id.custom_fab);

        setClickListenerToFabs();

        //setting custom font to the TextView
        tv_newFont = findViewById(R.id.tv_new_font);
        Typeface PatuaOne = Typeface.createFromAsset(this.getAssets(), "PatuaOne-Regular.ttf");
        tv_newFont.setTypeface(PatuaOne);

        img_animation_example = findViewById(R.id.img_animation_example);


    }

    private void setClickListenerToFabs(){
        floatingActionButton.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "FAB from the material library.", Toast.LENGTH_SHORT).show());

        imageButton.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "This is a custom fab.", Toast.LENGTH_SHORT).show()
        );
    }

    public void navigateToScrollActivity(View view){
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }

    public void navigateToScrimActivity(View view){

        Intent intent = new Intent(this, ScrimActivity.class);
        startActivity(intent);

    }

    public void navigateToAnimationActivity(View view){
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }

    private static boolean imageExists = true;

    public void onFrameClick(View view){
        if(imageExists){
            enableSlideEffect();
            img_animation_example.setVisibility(View.INVISIBLE);
            imageExists = false;
        }else{
            enableSlideEffect();
            img_animation_example.setVisibility(View.VISIBLE);
            imageExists = true;
        }
    }

    private void enableSlideEffect(){
        Slide slide = new Slide();
        slide.setSlideEdge(Gravity.TOP);
        ViewGroup viewGroup = findViewById(android.R.id.content);
        TransitionManager.beginDelayedTransition(viewGroup, slide);
    }

}
