package com.example.admin.eventmanagementapplication;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements GestureDetector.OnGestureListener{

    private GestureDetectorCompat gestureDetector;


    public ImageView events;
    public ImageView lectures;
    public ImageView initiatives;
    public ImageView competitions;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_);
        setTitle("Launch Activity");
        events = (ImageView) findViewById(R.id.Events);
        lectures = (ImageView) findViewById(R.id.lectures);
        initiatives = (ImageView) findViewById(R.id.initiatives);
        competitions = (ImageView) findViewById(R.id.competitions);
        events.setOnClickListener(new ImageView.OnClickListener() {

            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), events.class);
                startActivity(i1);
            }
        });
        lectures.setOnClickListener(new ImageView.OnClickListener() {

            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), lectures.class);
                startActivity(i1);
            }
        });
        initiatives.setOnClickListener(new ImageView.OnClickListener() {

            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), initiatives.class);
                startActivity(i1);
            }
        });
        competitions.setOnClickListener(new ImageView.OnClickListener() {

            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), competitions.class);
                startActivity(i1);
            }
        });
        this.gestureDetector = new GestureDetectorCompat(this, this);
    }
        @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.m1:
                Intent i1 = new Intent(getApplicationContext(),RegisterLogIn.class);
                startActivity(i1);
                break;
            case R.id.m2:
                Intent i2 = new Intent(getApplicationContext(),RegisterLogIn.class);
                startActivity(i2);
                break;

        }
        return true;
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)


    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
