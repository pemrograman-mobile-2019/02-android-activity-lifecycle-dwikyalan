package com.example.win10.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), text: "OnRestart", Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), text: "OnStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), text: "OnResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), text: "OnPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),text: "OnStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), text: "OnDestroy", Toast.LENGTH_SHORT).show();
    }
}

git status