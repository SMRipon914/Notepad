package com.example.notpade_share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_1,button_2,button_3,button_4,button_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findFile();


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_1){
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);

        }else if ((v.getId()==R.id.btn_2)){
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);

        }else if ((v.getId()==R.id.btn_3)){
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);

        }else if ((v.getId()==R.id.btn_4)){
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);

        }else if ((v.getId()==R.id.btn_5)){
            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);

        }
    }
    public void findFile(){
        button_1=findViewById(R.id.btn_1);
        button_2=findViewById(R.id.btn_2);
        button_3=findViewById(R.id.btn_3);
        button_4=findViewById(R.id.btn_4);
        button_5=findViewById(R.id.btn_5);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
    }
}
