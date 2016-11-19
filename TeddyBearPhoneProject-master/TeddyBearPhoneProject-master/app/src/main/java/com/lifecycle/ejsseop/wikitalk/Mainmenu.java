package com.lifecycle.ejsseop.wikitalk;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by umjin on 2016-01-30.
 */
public class Mainmenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        setTheme(android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
    }

    public void setWalkieTalkie(View v){
        Intent intent = new Intent(this, WalkieTalkieActivity.class);
        startActivity(intent);
    }

    public void setMapView(View v){
        Intent intent = new Intent(this, MapPane.class);
        startActivity(intent);
    }
    public void setTutoriView(View v){
        Intent intent = new Intent(this, tutorial.class);
        startActivity(intent);
    }

    public void setfinish(View v){
        finish();
    }
}
