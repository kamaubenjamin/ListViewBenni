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

import java.time.temporal.Temporal;

public class Windowsphone  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_windows_phone );
        Button button_windows = (Button) findViewById( R.id.button_windows );
        button_windows.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Windowsphone.this, MainActivity.class );
                Windowsphone.this.startActivity( intent );
            }
        } );


        Button button_change_windows = (Button) findViewById( R.id.button_change_windows );
        button_change_windows.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView_windows = (TextView)findViewById( R.id.textView_windows );
                textView_windows.setText( "This is A Microsoft Product" );
            }
        } );
    }
}
