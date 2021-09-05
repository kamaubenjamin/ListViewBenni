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

public class Android  extends AppCompatActivity
{
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate( savedInstanceState );
        setContentView( R.layout.activity_android );

        Button button_android = (Button) findViewById( R.id.button_android );
        button_android.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Android.this, MainActivity.class);
                Android.this.startActivity( intent );
            }
        } );

        Button button_Android = (Button) findViewById( R.id.button_Android );
        button_Android.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView_android = (TextView) findViewById( R.id.textView_android );
                textView_android.setText( "This is the Most Flexible device" );
            }
        } );
    }
}
