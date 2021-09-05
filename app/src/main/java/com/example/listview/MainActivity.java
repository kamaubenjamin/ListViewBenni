package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listview.Models.Android;
import com.example.listview.Models.BlackBerry;
import com.example.listview.Models.Iphone;
import com.example.listview.Models.Windowsphone;

public class MainActivity extends AppCompatActivity {

    // Array of strings...
    String mobileArray [] = {"Android","IPhone","WindowsMobile","Blackberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                String mobile = String.valueOf( parent.getItemAtPosition( position ));
                //Toast.makeText( MainActivity.this,mobile, Toast.LENGTH_SHORT ).show();
                
                Intent intent = new Intent(view.getContext(), MainActivity.class);

                if(position ==0 )
                {
                    intent = new Intent(view.getContext(), Android.class);
                    startActivity( intent );
                }
               if (position ==1)
               {
                   intent = new Intent(view.getContext(), Iphone.class);
                    startActivity( intent );
               }
                if (position ==2)
                {
                    intent = new Intent(view.getContext(), Windowsphone.class);
                    startActivity( intent );
                }
                if (position ==3)
                {
                    intent = new Intent(view.getContext(), BlackBerry.class);
                    startActivity( intent );
                }


            }


        }
        );
    }




}





