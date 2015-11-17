package com.example.jyothikrishnamurthy.menus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DynamicallyAddedContextMenu extends AppCompatActivity {
    TextView textView;
    MenuItem menuItemFile, menuItemEdit, menuItemView;
    int menuItemFileID=20, menuItemEditID=30,menuItemViewID=40;
    int fileOrder=200,editOrder=300,viewOrder=400;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamically_added_context_menu);
        textView = (TextView) findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        int groupId = 1;
        getMenuInflater().inflate(R.menu.menu_dynamically_added_options_menu, menu);
        menuItemFile = menu.add(groupId, menuItemFileID, fileOrder, R.string.file);
        menuItemEdit = menu.add(groupId, menuItemEditID, fileOrder, R.string.edit);
        menuItemView = menu.add(groupId, menuItemViewID, fileOrder, R.string.view);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int id=item.getItemId();

        if (id == menuItemFileID) {
            Toast.makeText(DynamicallyAddedContextMenu.this, "You clicked on File", Toast.LENGTH_LONG).show();
        }
        if (id == menuItemEditID) {
            Toast.makeText(DynamicallyAddedContextMenu.this, "You clicked on Edit", Toast.LENGTH_LONG).show();
        }
        if (id == menuItemViewID) {
            Toast.makeText(DynamicallyAddedContextMenu.this, "You clicked on View", Toast.LENGTH_LONG).show();
        }

        return true;
    }

}
