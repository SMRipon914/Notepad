package com.example.notpade_share;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    EditText editText_1,editText_2;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText_1=findViewById(R.id.editText_1);
        editText_2=findViewById(R.id.editText_2);
        save=findViewById(R.id.save);
        load();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveData();
                Toast.makeText(getApplicationContext(),"data save sussessfull",Toast.LENGTH_SHORT).show();
                load();
            }
        });
    }
    public void SaveData(){
        sharedPreferences=getSharedPreferences("SpName", Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor.putString("name",editText_1.getText().toString());
        editor.putString("pass",editText_2.getText().toString());
        editor.commit();
    }
    public void load(){
      sharedPreferences=getSharedPreferences("SpName",Context.MODE_PRIVATE);
      String value1=sharedPreferences.getString("name","no found");
      String value2=sharedPreferences.getString("pass","no found");
      editText_1.setText(value1);
      editText_2.setText(value2);
    }
}
