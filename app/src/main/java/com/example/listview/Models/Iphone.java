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

public class Iphone extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_iphone );

        Button button_iphone = (Button) findViewById( R.id.button_iphone );
        button_iphone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iphone.this, MainActivity.class);
                Iphone.this.startActivity( intent );

            }
        } );

        Button button_change_iphone = (Button) findViewById( R.id.button_change_iphone );
        button_change_iphone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView_iphone = (TextView) findViewById( R.id.textView_iphone );
                textView_iphone.setText( "prestigious And Valueble ASF" );
            }
        } );
    }
}
