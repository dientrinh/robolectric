package com.example.dientv.robolectricdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    public static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.btn);
        final TextView tv=(TextView)findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("456");
            }
        });
    }

    public int calculation(int number1, int number2){
        return number1 +number2;
    }
    public int multiple(int number1, int number2){
        return number1*number2;
    }
}
