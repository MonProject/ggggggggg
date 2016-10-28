package com.example.maxz.mon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button2;

    EditText NameEditText,TelEditText;
    String NameString,TelString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.btn1);

        NameEditText = (EditText) findViewById(R.id.editText);
        TelEditText = (EditText) findViewById(R.id.editText2);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NameString = NameEditText.getText().toString().trim();
                TelString = TelEditText.getText().toString().trim();


                if (NameString.equals("") || TelString.equals("") ) {

                    Toast.makeText(MainActivity.this,"กรุณากรอกให้ครบ",Toast.LENGTH_LONG).show();

                } else {
                    Intent intent = new Intent(getApplicationContext(), Sell.class);
                    startActivity(intent);
//                    Toast.makeText(MainActivity.this,"เข้าสู่ระบบเรียบร้อย",Toast.LENGTH_LONG).show();

                }
//
            }
        });
    }
}
