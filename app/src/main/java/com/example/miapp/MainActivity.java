package com.example.miapp;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private static String TAG = "Informa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"En on create()");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"En onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"En onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"En onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"En OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"En onDestroy()");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"En onPause()");
    }


}