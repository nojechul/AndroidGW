package com.example.sunrinton.interpeople;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LV_suggestion;
    ArrayList<SuggestData> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LV_suggestion = findViewById(R.id.LV_Suggestion);

        items.add(new SuggestData("너무 시끄럽네요. 신고하겠습니다."));
        items.add(new SuggestData("조금만 조용히 해주시겠습니까?"));
        items.add(new SuggestData("오우 제대로 놀아보자!"));
        items.add(new SuggestData("좀 놀줄 아시는 분인가 보군요."));





        SuggestCustomAdapter mAdapter = new SuggestCustomAdapter(items, this);
        LV_suggestion.setAdapter(mAdapter);


    }
}
