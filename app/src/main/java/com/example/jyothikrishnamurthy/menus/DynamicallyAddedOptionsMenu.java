package com.example.jyothikrishnamurthy.menus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DynamicallyAddedOptionsMenu extends AppCompatActivity {

    MenuItem menuItemFile, menuItemEdit, menuItemView;
            int menuItemFileID=20, menuItemEditID=30,menuItemViewID=40;
    int fileOrder=200,editOrder=300,viewOrder=400;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamically_added_options_menu);
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

        int groupId = 1;
        getMenuInflater().inflate(R.menu.menu_dynamically_added_options_menu, menu);
        menuItemFile = menu.add(groupId, menuItemFileID, fileOrder, R.string.file);
        menuItemEdit = menu.add(groupId, menuItemEditID, fileOrder, R.string.edit);
        menuItemView = menu.add(groupId, menuItemViewID, fileOrder, R.string.view);

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if (id == menuItemFileID) {
            Toast.makeText(DynamicallyAddedOptionsMenu.this, "You clicked on File", Toast.LENGTH_LONG).show();
        }
        if (id == menuItemEditID) {
            Toast.makeText(DynamicallyAddedOptionsMenu.this, "You clicked on Edit", Toast.LENGTH_LONG).show();
        }
        if (id == menuItemViewID) {
            Toast.makeText(DynamicallyAddedOptionsMenu.this, "You clicked on View", Toast.LENGTH_LONG).show();
        }

        return true;
    }
}
