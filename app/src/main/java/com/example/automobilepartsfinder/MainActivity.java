package com.example.automobilepartsfinder;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //widgets
    Button btn;
    TextView t1,t2;

    Animation animate_button, animate_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        //animation
        animate_button = AnimationUtils.loadAnimation(this,R.anim.animate_button);
        animate_txt = AnimationUtils.loadAnimation(this,R.anim.animate_text);
        btn.setAnimation(animate_button);
        t1.setAnimation(animate_txt);
        t2.setAnimation(animate_txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
      /*  new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(StartScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },3000);*/

    }
    public void openMain(){
        Intent intent = new Intent(MainActivity.this,AutoPartsDealerActivity.class);
        startActivity(intent);
    }
}