package com.example.maxz.mon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sell extends AppCompatActivity {

    Button  button;

    EditText NumberEditext;
    String NumberString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        button = (Button) findViewById(R.id.button);

        NumberEditext = (EditText) findViewById(R.id.editText5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumberString = NumberEditext.getText().toString().trim();


                if (NumberString.equals("") ) {

                    Toast.makeText(Sell.this,"กรุณาใส่จำนวนสั่งซื้อ",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), Address.class);
                    startActivity(intent);
//                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
