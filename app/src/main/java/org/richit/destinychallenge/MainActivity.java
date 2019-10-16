package org.richit.destinychallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ans_btn1,ans_btn2;
    TextView story_tv;
    int story_number=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans_btn1=findViewById(R.id.ans_btn1);
        ans_btn2=findViewById(R.id.ans_btn2);
        story_tv=findViewById(R.id.story_tv);

        ans_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(story_number==1 || story_number==2){
                    story_tv.setText(R.string.T3_Story);
                    ans_btn1.setText(R.string.T3_Ans1);
                    ans_btn2.setText(R.string.T3_Ans2);
                    story_number=3;
                }
                else{
                    story_tv.setText(R.string.T6_End);
                    ans_btn1.setVisibility(View.GONE);
                    ans_btn2.setVisibility(View.GONE);
                }

            }
        });

        ans_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(story_number==1){
                    story_tv.setText(R.string.T2_Story);
                    ans_btn1.setText(R.string.T2_Ans1);
                    ans_btn2.setText(R.string.T2_Ans2);
                    story_number=2;
                }
                else if(story_number==2){
                    story_tv.setText(R.string.T4_End);
                    ans_btn1.setVisibility(View.GONE);
                    ans_btn2.setVisibility(View.GONE);
                }
                else{
                    story_tv.setText(R.string.T5_End);
                    ans_btn1.setVisibility(View.GONE);
                    ans_btn2.setVisibility(View.GONE);
                }
            }
        });
    }
}
