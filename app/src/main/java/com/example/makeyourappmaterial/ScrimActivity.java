package com.example.makeyourappmaterial;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ScrimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrim);
        Toolbar toolbar = findViewById(R.id.toolbar_scrim);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Puma");

        FloatingActionButton fab = findViewById(R.id.fab_scrim);
        fab.setOnClickListener( view ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
        );
    }
}
