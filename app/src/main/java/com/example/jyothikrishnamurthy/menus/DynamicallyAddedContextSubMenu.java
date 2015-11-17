package com.example.jyothikrishnamurthy.menus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DynamicallyAddedContextSubMenu extends AppCompatActivity {
    TextView textView;
    MenuItem menuItemFile, menuItemEdit, menuItemView;
    SubMenu subMenuOne, subMenuTwo, subMenuThree;
    int menuItemFileID=20, menuItemEditID=30,menuItemViewID=40;
    int fileOrder=200,editOrder=300,viewOrder=400;
    int submenuOneID=10, submenutwoID=50,submenuThreeID=60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamically_added_context_sub_menu);
        textView = (TextView) findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        int groupId = 1;
        int groupIdForSub = 2;
        getMenuInflater().inflate(R.menu.menu_dynamically_added_options_sub_menu, menu);
        SubMenu sub=menu.addSubMenu(groupId, menuItemFileID, fileOrder, R.string.file);
        sub.add(groupIdForSub, submenuOneID, Menu.NONE, getText(R.string.submenuOne));
        sub.add(groupIdForSub, submenutwoID, Menu.NONE, getText(R.string.subMenuTwo));
        sub.add(groupIdForSub, submenuThreeID, Menu.NONE, getText(R.string.subMenuThree));
        menuItemEdit = menu.add(groupId, menuItemEditID, editOrder, R.string.edit);
        menuItemView = menu.add(groupId, menuItemViewID, viewOrder, R.string.view);
    }

    public boolean onContextItemSelected(MenuItem item) {

        int id=item.getItemId();

        if (id == menuItemFileID) {
            Toast.makeText(DynamicallyAddedContextSubMenu.this, "You clicked on File", Toast.LENGTH_LONG).show();
        }
        if (id == menuItemEditID) {
            Toast.makeText(DynamicallyAddedContextSubMenu.this, "You clicked on Edit", Toast.LENGTH_LONG).show();
        }
        if (id == menuItemViewID) {
            Toast.makeText(DynamicallyAddedContextSubMenu.this, "You clicked on View", Toast.LENGTH_LONG).show();
        }

        return true;
    }

}
