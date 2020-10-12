package com.example.mirimlayouttest2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LinearLayout linear1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        linear1.setBackgroundColor(Color.rgb(227,196,255));
        linear1.setOrientation(LinearLayout.VERTICAL);

        Button btn = new Button(this);
        btn.setText("클릭해 보세요");
        btn.setBackgroundColor(Color.rgb(128, 65, 217));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Java 코드로 작성한 버튼입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        setContentView(linear1, params);
    }
}