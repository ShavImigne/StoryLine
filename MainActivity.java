package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyview;
    private Button line1;
    private Button line2;
    private int index =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyview = (TextView) findViewById(R.id.storyTextView);
        line1 = (Button) findViewById(R.id.buttonTop);
        line2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        line1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index==1){
                    storyview.setText(R.string.T3_Story);
                    line1.setText(R.string.T3_Ans1);
                    line2.setText(R.string.T3_Ans2);
                    index =3;
                }
                else if(index==3){
                    storyview.setText(R.string.T6_End);
                    line1.setVisibility(View.GONE);
                    line2.setVisibility(View.GONE);
                }
                else if(index==2){
                    storyview.setText(R.string.T3_Story);
                    line1.setText(R.string.T3_Ans1);
                    line2.setText(R.string.T3_Ans2);
                    index =3;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        line2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index==1){
                    storyview.setText(R.string.T2_Story);
                    line1.setText(R.string.T2_Ans1);
                    line2.setText(R.string.T2_Ans2);
                    index =2;
                }
                else if(index==2){
                    storyview.setText(R.string.T4_End);
                    line1.setVisibility(View.GONE);
                    line2.setVisibility(View.GONE);
                }
                else if(index==3){
                    storyview.setText(R.string.T5_End);
                    line1.setVisibility(View.GONE);
                    line2.setVisibility(View.GONE);
                }
            }
        });
    }
}
