package com.example.herpiko.learningeventhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener tekan = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Status", "Menggunakan anonymous inner class");
            }
        };

        Button tbl3 = (Button) findViewById(R.id.button3);
        Button tbl4 = (Button) findViewById(R.id.button4);
        tbl3.setOnClickListener(tekan);
        tbl4.setOnClickListener(tekan);
        Button tbl5 = (Button) findViewById(R.id.button5);
        Button tbl6 = (Button) findViewById(R.id.button6);
        tbl5.setOnClickListener(this);
        tbl6.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void pencet (View v) {
        String label= ((Button)v).getText().toString();

        Log.i("Status", label +" memanggil fungsi pencet");
        Toast.makeText(this, label + " method pencet", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View view) {
        Log.i("Status", "menggunakan activity class");
    }
}
