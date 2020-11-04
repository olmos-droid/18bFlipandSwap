package com.example.a18bflipandswap;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView1;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;

    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;

    private AnimatorSet animatorSet;


    private boolean aBoolean1 = true;
    private boolean aBoolean2 = true;
    private boolean aBoolean3 = true;
    private boolean aBoolean4 = true;
    private boolean aBoolean5 = true;


    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator2;
    ObjectAnimator objectAnimator3;
    ObjectAnimator objectAnimator4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hook
        imageView1 = (ImageView) findViewById(R.id.phone1);
        imageView6 = (ImageView) findViewById(R.id.phone2);

        imageView2 = (ImageView) findViewById(R.id.olivas1);
        imageView7 = (ImageView) findViewById(R.id.olivas2);

        textView1 = (TextView) findViewById(R.id.texto);
        imageView3 = (ImageView) findViewById(R.id.mechero1);
        imageView8 = (ImageView) findViewById(R.id.mechero2);

        imageView4 = (ImageView) findViewById(R.id.body1);
        imageView9 = (ImageView) findViewById(R.id.body2);

        imageView5 = (ImageView) findViewById(R.id.vaso1);
        imageView10 = (ImageView) findViewById(R.id.vaso2);


        // imatges front
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        textView1.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);

        // imatges back
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageView10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.phone1:
                aBoolean1 = animaFoto(imageView1, imageView6, aBoolean1);
                break;
            case R.id.olivas1:
                aBoolean2 = animaFoto(imageView2, imageView7, aBoolean2);
                break;
            case R.id.mechero2:
                aBoolean3 = animaFoto2(imageView8, imageView3, textView1, aBoolean3);
                break;
            case R.id.body2:
                aBoolean4 = animaFoto3(imageView9, imageView4, aBoolean4);
                break;
            case R.id.vaso2:
                aBoolean5 = animaFoto3(imageView10, imageView5, aBoolean5);

        }

    }

    private Boolean animaFoto(ImageView frontfoto, ImageView backfoto, Boolean aBoolean) {

        if (aBoolean) {
            aBoolean = false;
            objectAnimator1 = ObjectAnimator.ofFloat(frontfoto, "RotationX", 0, 180);
            objectAnimator1.setDuration(1000);
            objectAnimator2 = ObjectAnimator.ofFloat(frontfoto, "Alpha", 1, 0);
            objectAnimator2.setStartDelay(500);
            objectAnimator2.setDuration(1);

            objectAnimator3 = ObjectAnimator.ofFloat(backfoto, "RotationX", 0, 180);
            objectAnimator3.setDuration(1000);
            objectAnimator4 = ObjectAnimator.ofFloat(backfoto, "Alpha", 0, 1);
            objectAnimator4.setStartDelay(500);
            objectAnimator4.setDuration(1);


        } else {
            aBoolean = true;
            objectAnimator1 = ObjectAnimator.ofFloat(frontfoto, "RotationX", 180, 0);
            objectAnimator1.setDuration(1000);
            objectAnimator2 = ObjectAnimator.ofFloat(frontfoto, "Alpha", 0, 1);
            objectAnimator2.setStartDelay(500);

            objectAnimator3 = ObjectAnimator.ofFloat(backfoto, "RotationX", 180, 0);
            objectAnimator3.setDuration(1000);
            objectAnimator4 = ObjectAnimator.ofFloat(backfoto, "Alpha", 1, 0);
            objectAnimator4.setStartDelay(500);
            objectAnimator4.setDuration(1);

        }
        animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3, objectAnimator4);
        animatorSet.start();

        return aBoolean;
    }

    private Boolean animaFoto2(ImageView back, ImageView front, TextView backfoto, Boolean aBoolean) {

        if (aBoolean) {
            aBoolean = false;
            objectAnimator3 = ObjectAnimator.ofFloat(front, "Alpha", 1, 0);
            objectAnimator3.setDuration(1000);

            objectAnimator2 = ObjectAnimator.ofFloat(back, "Alpha", 1, 0.3f);
            objectAnimator2.setDuration(1000);

            objectAnimator4 = ObjectAnimator.ofFloat(backfoto, "Alpha", 0, 1);
            objectAnimator4.setDuration(1000);


        } else {
            aBoolean = true;
            objectAnimator3 = ObjectAnimator.ofFloat(front, "Alpha", 0, 1);
            objectAnimator3.setDuration(1000);

            objectAnimator2 = ObjectAnimator.ofFloat(back, "Alpha", 0.3f, 1);
            objectAnimator2.setDuration(1000);

            objectAnimator4 = ObjectAnimator.ofFloat(backfoto, "Alpha", 1, 0);
            objectAnimator4.setDuration(1000);
        }
        animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator2, objectAnimator3, objectAnimator4);
        animatorSet.start();

        return aBoolean;
    }

    private Boolean animaFoto3(ImageView frontfoto, ImageView backfoto, Boolean aBoolean) {

        if (aBoolean) {
            aBoolean = false;
//            objectAnimator1 = ObjectAnimator.ofFloat(frontfoto, "RotationY", 0, 180);
//            objectAnimator1.setDuration(1000);
            objectAnimator2 = ObjectAnimator.ofFloat(frontfoto, "Alpha", 1, 0);
            objectAnimator2.setStartDelay(500);
            objectAnimator2.setDuration(1000);

//            objectAnimator3 = ObjectAnimator.ofFloat(backfoto, "RotationY", 0, 180);
//            objectAnimator3.setDuration(1000);
            objectAnimator4 = ObjectAnimator.ofFloat(backfoto, "Alpha", 0, 1);
            objectAnimator4.setStartDelay(500);
            objectAnimator4.setDuration(1000);


        } else {
            aBoolean = true;
//            objectAnimator1 = ObjectAnimator.ofFloat(frontfoto, "RotationY", 180, 0);
//            objectAnimator1.setDuration(1000);
            objectAnimator2 = ObjectAnimator.ofFloat(frontfoto, "Alpha", 0, 1);
            objectAnimator2.setStartDelay(500);
            objectAnimator2.setDuration(1000);


//            objectAnimator3 = ObjectAnimator.ofFloat(backfoto, "RotationY", 180, 0);
//            objectAnimator3.setDuration(1000);
            objectAnimator4 = ObjectAnimator.ofFloat(backfoto, "Alpha", 1, 0);
            objectAnimator4.setStartDelay(500);
            objectAnimator4.setDuration(1000);

        }
        animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator2, objectAnimator4);
        animatorSet.start();

        return aBoolean;
    }
}