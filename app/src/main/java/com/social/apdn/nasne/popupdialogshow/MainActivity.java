package com.social.apdn.nasne.popupdialogshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView clickPopUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        clickPopUp = findViewById(R.id.clickPopUpDia);

        clickPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProcessToShowPopUpDialog();
            }
        });
    }

    private void ProcessToShowPopUpDialog()
    {
        PopupMenu popupMenu = new PopupMenu(getApplicationContext() , clickPopUp);
        popupMenu.getMenuInflater().inflate(R.menu.pop_up_menu , popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId())
                {

                    case R.id.profile:
                        Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.block:
                        Toast.makeText(MainActivity.this, "Block", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.theme:
                        Toast.makeText(MainActivity.this, "Theme", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        break;


                }
                return true;
            }
        });
        popupMenu.show();
    }
}