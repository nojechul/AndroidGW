package com.example.sunrinton.interpeople;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestActivity extends AppCompatActivity {

    ListView LV_RQ;
    ArrayList<RequestData> items = new ArrayList<>();
    TextView dong, ho, reason;
    String str1[], str2[], str3[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        LV_RQ = findViewById(R.id.LV_RQ);
        final RequestAdapater mAdapter = new RequestAdapater(items, this);
        LV_RQ.setAdapter(mAdapter);
        dong = findViewById(R.id.dongTV);
        ho = findViewById(R.id.hoTV);
        reason = findViewById(R.id.reason);
        str1 = new String[]{"101동", "102동", "103동", "104동", "105동", "106동", "107동", "108동"};
        str2 = new String[]{"101호", "102호", "103호", "201호", "202호", "203호", "303호", "401호", "402호", "403호"};
        str3 = new String[]{"아이소리", "망치질", "가전제품", "가구", "악기", "대화", "진동", "문 개폐", "급배수", "운동기구", "동물소리", "부엌조리", "기타"};

        for (String item : str1) {
            items.add(new RequestData(item));
        }

        dong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.clear();
                for (String item : str1) {
                    items.add(new RequestData(item));
                }
                mAdapter.notifyDataSetChanged();
            }
        });
        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.clear();
                for (String item : str2) {
                    items.add(new RequestData(item));
                }
                mAdapter.notifyDataSetChanged();

            }
        });
        reason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.clear();
                for (String item : str3) {
                    items.add(new RequestData(item));
                }
                mAdapter.notifyDataSetChanged();

            }
        });

    }
}
