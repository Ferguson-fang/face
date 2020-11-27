package com.example.activitytest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FristActivity extends AppCompatActivity {
    private Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist_layout);
        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked Button1",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FristActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });
    }
}