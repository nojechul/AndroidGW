package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LV_suggestion;
    ArrayList<SuggestData> items = new ArrayList<>();
    Spinner hospinner;
    Spinner dongspinner;
    ArrayList<String> holist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LV_suggestion = findViewById(R.id.LV_Suggestion);
        Button BT = findViewById(R.id.BTbutton);
        Button RQ = findViewById(R.id.requestbutton);

        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BluetoothActivity.class);
                startActivity(intent);
            }
        });
        Button Login = findViewById(R.id.loginbutton);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });
        RQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent request = new Intent(MainActivity.this, RequestActivity.class);
                startActivity(request);
            }
        });

        items.add(new SuggestData("너무 시끄럽네요. 신고하겠습니다."));
        items.add(new SuggestData("조금만 조용히 해주시겠습니까?"));
        items.add(new SuggestData("오우 제대로 놀아보자!"));
        items.add(new SuggestData("좀 놀줄 아시는 분인가 보군요."));





        SuggestCustomAdapter mAdapter = new SuggestCustomAdapter(items, this);
        LV_suggestion.setAdapter(mAdapter);


    }
}
