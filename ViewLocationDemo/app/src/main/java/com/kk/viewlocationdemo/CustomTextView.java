package com.kk.viewlocationdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * ===================
 * 作   者: 杜凯
 * 创建日期: 2018/5/3
 * 描   述:
 * ===================
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
//        super.onLayout(changed, left, top, right, bottom);
//    }
//
    @Override
    public void layout(int l, int t, int r, int b) {
        super.layout(0, 20, 200, 70);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();//0.62997437
        float y = event.getY();//1.4893188

        float rawX = event.getRawX();//399.62997
        float rawY = event.getRawY();//980.4893

        return super.onTouchEvent(event);
    }
}
