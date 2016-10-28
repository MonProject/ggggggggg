package com.example.maxz.mon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Thang extends AppCompatActivity {

    Button button3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thang);
        button3 = (Button) findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(getApplicationContext(), Thang.class);
                startActivity(intent);

                Toast.makeText(Thang.this,"สั่งซื้อเรียบร้อยแล้ว",Toast.LENGTH_LONG).show();
            }

        });

    }
}
