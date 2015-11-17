package com.example.jyothikrishnamurthy.menus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class StaticSubMenuForOptionsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_sub_menu_for_options_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.submenu_static_options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.edit) {
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on Edit", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.view) {
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on View", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.save) {
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on Save", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.file) {
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on File", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.copy) {
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on Copy", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.submenu_one){
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on Sub Menu One", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.submenu_two){
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on Sub Menu Two", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.submenu_three){
            Toast.makeText(StaticSubMenuForOptionsMenu.this, "You clicked on Sub Menu Three", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }




}



