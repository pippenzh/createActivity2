package com.example.administrator.createactivity2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private Button mBtnStartSecond;
    private EditText mEtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate()........");
        mBtnStartSecond = (Button) findViewById(R.id.button);
        mEtInput = (EditText) findViewById(R.id.et_input);
        mBtnStartSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                String input = mEtInput.getText().toString();
                Log.d("MainActivity", input);
                i.putExtra("userInput", input);
                //startActivity(i);
                startActivityForResult(i, 1);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("MainActivity", "返回的数据是" + data.getStringExtra("data"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()........");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", " onResume()........");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", " onPause()........");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", " onStop()........");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", " onDestroy()........");
    }
}
