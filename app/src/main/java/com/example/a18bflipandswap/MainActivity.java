package com.example.a18bflipandswap;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;

    private boolean aBoolean = true;

    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator2;
    ObjectAnimator objectAnimator3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.mechero);
        imageView2 = (ImageView) findViewById(R.id.cadena);
        imageView3 = (ImageView) findViewById(R.id.pinza);
        imageView4 = (ImageView) findViewById(R.id.monedas);
        imageView5 = (ImageView) findViewById(R.id.ring);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "mechoro tocat", Toast.LENGTH_SHORT);

        switch (v.getId()) {

            case R.id.mechero:

                if (aBoolean) {
                    aBoolean = false;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView1, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView1, "RotationX", 0f, 180f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView1, "Alpha", 1, 0);
                    objectAnimator3.setDuration(1000);
                } else {
                    aBoolean = true;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView1, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView1, "RotationX", 180f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView1, "Alpha", 0, 1);
                    objectAnimator3.setDuration(1000);

                }
                break;

            case R.id.cadena:

                if (aBoolean) {
                    aBoolean = false;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView2, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView2, "RotationX", 0f, 180f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView2, "Alpha", 1, 0);
                    objectAnimator3.setDuration(1000);
                } else {
                    aBoolean = true;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView2, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView2, "RotationX", 180f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView2, "Alpha", 0,1);
                    objectAnimator3.setDuration(1000);
                }
                break;

            case R.id.pinza:

                if (aBoolean) {
                    aBoolean = false;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView3, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView3, "RotationX", 0f, 180f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView3, "Alpha", 1,0);
                    objectAnimator3.setDuration(1000);
                } else {
                    aBoolean = true;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView3, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView3, "RotationX", 180f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView3, "Alpha", 0, 1);
                    objectAnimator3.setDuration(1000);
                }
                break;

            case R.id.monedas:

                if (aBoolean) {
                    aBoolean = false;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView4, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView4, "RotationX", 0f, 180f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView4, "Alpha", 1, 0);
                    objectAnimator3.setDuration(1000);
                } else {
                    aBoolean = true;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView4, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView4, "RotationX", 180f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView4, "Alpha", 0,1);
                    objectAnimator3.setDuration(1000);
                }
                break;

            case R.id.ring:
                if (aBoolean) {
                    aBoolean = false;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView5, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView5, "RotationX", 0f, 180f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView5, "Alpha", 1,0);
                    objectAnimator3.setDuration(1000);
                } else {
                    aBoolean = true;
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView5, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView5, "RotationX", 180f, 0f);
                    objectAnimator2.setDuration(1000);
                    objectAnimator3 = ObjectAnimator.ofFloat(imageView5, "Alpha", 0,1);
                    objectAnimator3.setDuration(1000);
                }
                break;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3);
        animatorSet.start();
        animatorSet.resume();


    }
}