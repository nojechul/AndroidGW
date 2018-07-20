package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText apartment, dong, ho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        apartment = findViewById(R.id.apartmentedit);
        dong = findViewById(R.id.dongedit);
        ho = findViewById(R.id.hoedit);
        Button start = findViewById(R.id.start);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apartstr = apartment.getText().toString();
                String dongstr = dong.getText().toString();
                String hostr = ho.getText().toString();
                LoginData data = new LoginData(apartstr,dongstr,hostr);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("Apartment",data.getApartment());
                intent.putExtra("Dong",data.getDong());
                intent.putExtra("Ho",data.getHo());
                startActivity(intent);
                finish();
            }
        });
    }
}
