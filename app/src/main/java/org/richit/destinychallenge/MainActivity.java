package org.richit.destinychallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ans_btn1,ans_btn2;
    TextView story_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans_btn1=findViewById(R.id.ans_btn1);
        ans_btn2=findViewById(R.id.ans_btn2);
        story_tv=findViewById(R.id.story_tv);


    }
}
