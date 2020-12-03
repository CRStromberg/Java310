package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText part;
    Button search;
    myDbAdapter helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        part = (EditText)findViewById(R.id.partNum);
        helper = new myDbAdapter(this);

    }

    public void addPartNum(View view) {
        String prtNum = part.getText().toString();

        if(prtNum.isEmpty())
        {
            Message.message(getApplicationContext(),"Enter Part Number");
        } else {
            long id = helper.insertData(prtNum);
        }
        part.setText("");
    }

    Public void viewData(View view) {
        String data = helper.getdata();
        Message.message(this,data);
    }
}