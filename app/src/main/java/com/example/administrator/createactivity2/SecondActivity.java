package com.example.administrator.createactivity2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;



public class SecondActivity extends ActionBarActivity {
    private TextView mTvPassed;
    private Button mBtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String userInput = getIntent().getStringExtra("userInput");
        Log.d("SecongActivity", "传进来的是：" + userInput);
        mTvPassed = (TextView) findViewById(R.id.tv_passed);
        mTvPassed.setText(userInput);
        mBtnBack = (Button) findViewById(R.id.btn_back);

        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("data", "test");
                Log.d("SecondActivity", "准备返回数据：" + "test");
                setResult(1, i);
                finish();
            }
        });


    }
}