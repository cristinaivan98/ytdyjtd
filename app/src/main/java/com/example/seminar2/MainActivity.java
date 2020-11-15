package com.example.seminar2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CicluDeViata","A fost apelata metoda onCeate");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"A fost apelata metoda onStop",Toast.LENGTH_LONG).show();
        Log.e("CicluDeViata","a fost apelata metoda onStop");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "S a apelat metoda start", Toast.LENGTH_SHORT).show();
        Log.d("CicluDeviata","S a apelat metoda onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"S a apelat metoda onPause",Toast.LENGTH_LONG).show();
        Log.v("CicluDeViata","S a apelat metoda onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "S a apelat metoda onResume", Toast.LENGTH_SHORT).show();
        Log.w("CicluDeViata","S a apelat metoda onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"S a apelat metoda onDestroy",Toast.LENGTH_LONG).show();
        Log.wtf("CicluDeViata","S a apelat metoda OnDestroy");
    }


}

