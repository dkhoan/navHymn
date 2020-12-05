package com.myapp.navhymntest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    GridLayout group1, group2, group3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        group1 = (GridLayout) findViewById(R.id.group1);
        group2 = (GridLayout) findViewById(R.id.group2);
        group3 = (GridLayout) findViewById(R.id.group3);
        group1.setVisibility(View.GONE);
        //group2.setVisibility(View.GONE);
        group3.setVisibility(View.GONE);
    }

    //Navigation control
    public void toggle_group1(View v){
        if(group1.isShown()){
            group1.setVisibility(View.GONE);
            group2.setVisibility(View.VISIBLE);
            group3.setVisibility(View.GONE);
        }else {
            group1.setVisibility(View.VISIBLE);
            group2.setVisibility(View.GONE);
            group3.setVisibility(View.GONE);
        }
        /*group1.setVisibility( group1.isShown()
                ? View.GONE
                : View.VISIBLE );*/
    }
    public void toggle_group2(View v){
        if(group2.isShown()){
            group2.setVisibility(View.GONE);
            group3.setVisibility(View.VISIBLE);
            group1.setVisibility(View.GONE);
        }else {
            group2.setVisibility(View.VISIBLE);
            group1.setVisibility(View.GONE);
            group3.setVisibility(View.GONE);
        }
        /*group2.setVisibility( group2.isShown()
                ? View.GONE
                : View.VISIBLE );*/
    }
    public void toggle_group3(View v){
        if(group3.isShown()){
            group3.setVisibility(View.GONE);
            group1.setVisibility(View.VISIBLE);
            group2.setVisibility(View.GONE);
        }else {
            group3.setVisibility(View.VISIBLE);
            group1.setVisibility(View.GONE);
            group2.setVisibility(View.GONE);
        }
      /*  group3.setVisibility( group3.isShown()
                ? View.GONE
                : View.VISIBLE );*/
    }
    public void toggle_all(View v){
        if(group1.isShown()==false){
            group1.setVisibility(View.VISIBLE);}
        if(group2.isShown()==false){
            group2.setVisibility(View.VISIBLE);}
        if(group3.isShown()==false){
            group3.setVisibility(View.VISIBLE);}
    }

}