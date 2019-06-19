package com.example.makeyourappmaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton floatingActionButton;
    ImageButton imageButton;
    TextView tv_newFont;

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


}
