package com.example.listview.Models;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.listview.MainActivity;
import com.example.listview.R;

public class BlackBerry extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.acrivity_blackberry );
        //button Back
        Button button_blackberry = (Button) findViewById( R.id.button_blackberry );
        button_blackberry.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BlackBerry.this, MainActivity.class);
                BlackBerry.this.startActivity( intent );


            }
        } );


        Button change = (Button) findViewById( R.id.button_changebb );
        change.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView_blackberry = (TextView) findViewById( R.id.textView_blackberry );
                textView_blackberry.setText("This is American Made Model");
            }
        } );

    }
}
