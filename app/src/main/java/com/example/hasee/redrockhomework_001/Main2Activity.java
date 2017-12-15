package com.example.hasee.redrockhomework_001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Main2Activity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button_2=(Button)findViewById(R.id.sex_chose);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(getApplicationContext(),view);
                MenuInflater menuInflater =new MenuInflater(getApplicationContext());
                menuInflater.inflate(R.menu.menu_01,popupMenu.getMenu());
                popupMenu.show();



            }
        })
        ;
    }

}