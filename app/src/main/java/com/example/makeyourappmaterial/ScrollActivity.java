package com.example.makeyourappmaterial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ScrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

       CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar_layout);
       Toolbar toolbar = findViewById(R.id.tool_bar);

        collapsingToolbarLayout.setTitleEnabled(true);
        collapsingToolbarLayout.setTitle(getResources().getString(R.string.tim_hortons));

        //set title color to white - on both collapsed and expanded mode
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);

        //set click listener to navigation icon "<-"
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

}
