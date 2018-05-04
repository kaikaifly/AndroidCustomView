package com.kk.viewlocationdemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.sample_text);
        textView.setText("Hello from C++");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "TranslationY", 300f);
                animator.setDuration(1000);
                animator.start();
                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        int left = textView.getLeft();//399
                        int top = textView.getTop();//739
                        int right = textView.getRight();//680
                        int bottom = textView.getBottom();//796

                        int width = textView.getWidth();//281
                        int height = textView.getHeight();//57

                        int measuredWidth = textView.getMeasuredWidth();//281
                        int measuredHeight = textView.getMeasuredHeight();//57

                        float x = textView.getX();//499
                        float y = textView.getY();//739

                        float translationX = textView.getTranslationX();//100
                        float translationY = textView.getTranslationY();//0
                    }

                });

            }
        });

//        ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "TranslationY", 300f);
//        animator.setDuration(1000);
//        animator.start();
//        animator.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                super.onAnimationEnd(animation);
//                int left = textView.getLeft();//399
//                int top = textView.getTop();//739
//                int right = textView.getRight();//680
//                int bottom = textView.getBottom();//796
//
//                int width = textView.getWidth();//281
//                int height = textView.getHeight();//57
//
//                int measuredWidth = textView.getMeasuredWidth();//281
//                int measuredHeight = textView.getMeasuredHeight();//57
//
//                float x = textView.getX();//499
//                float y = textView.getY();//739
//
//                float translationX = textView.getTranslationX();//100
//                float translationY = textView.getTranslationY();//0
//            }
//
//        });

        textView.post(new Runnable() {
            @Override
            public void run() {
                int left = textView.getLeft();//399
                int top = textView.getTop();//739
                int right = textView.getRight();//680
                int bottom = textView.getBottom();//796

                int width = textView.getWidth();//281
                int height = textView.getHeight();//57

                int measuredWidth = textView.getMeasuredWidth();//281
                int measuredHeight = textView.getMeasuredHeight();//57

                float x = textView.getX();//399
                float y = textView.getY();//739

                float translationX = textView.getTranslationX();//0
                float translationY = textView.getTranslationY();//0
            }
        });

//        textView.layout(100, 100, 500, 500);
    }
}
