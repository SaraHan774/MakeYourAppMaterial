package com.example.makeyourappmaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {

    TextView tv_content_title;
    TextView tv_artist_name;
    ImageButton img_btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        tv_content_title = findViewById(R.id.tv_content_title);
        tv_artist_name = findViewById(R.id.tv_artist_name);
        img_btn_info = findViewById(R.id.img_btn_info);

        Typeface patuaOne = Typeface.createFromAsset(this.getAssets(), "PatuaOne-Regular.ttf");
        tv_content_title.setTypeface(patuaOne);
        tv_artist_name.setTypeface(patuaOne);


        img_btn_info.setOnClickListener(view ->
                onClickImgBtn()
                );
    }

    private void onClickImgBtn(){
        TransitionManager.go(Scene.getSceneForLayout(
                findViewById(android.R.id.content),
                R.layout.activity_animation_show_more,
                this
        ));


        //TODO : keep showing default transition... not recognizing rsc/transition/to_info.xml file.

//        TransitionInflater.from(this)
//                .inflateTransition(R.transition.to_info);
    }
}
