package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button zhuCe;
    private Button xinLang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button2 = findViewById(R.id.login);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"密码正确，成功进入"
                        ,Toast.LENGTH_LONG).show();
            }
        });
        zhuCe = findViewById(R.id.zhuCe);
        zhuCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"开始注册",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        xinLang = findViewById(R.id.xinLang);
        xinLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"使用新浪微博登录",
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SecondActivity.this,xinLangActivity.class);
                startActivity(intent);
            }
        });
    }
}