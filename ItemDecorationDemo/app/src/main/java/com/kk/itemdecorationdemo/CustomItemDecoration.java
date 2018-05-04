package com.kk.itemdecorationdemo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/**
 * ===================
 * 作   者: 杜凯
 * 创建日期: 2018/5/3
 * 描   述:
 * ===================
 */

public class CustomItemDecoration extends RecyclerView.ItemDecoration {

    public static final int DIVIDER_HEIGHT = 20;
    private final Paint paint;

    public CustomItemDecoration() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
//
        int childCount = parent.getChildCount();
        int left = parent.getPaddingLeft();
        int right = parent.getMeasuredWidth() - parent.getPaddingRight();
        for (int i = 0; i < childCount; i++) {
            if (i == childCount - 1) {
                return;
            } else {
                View child = parent.getChildAt(i);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
                int top = child.getBottom() + layoutParams.bottomMargin;
                int bottom = top + DIVIDER_HEIGHT;
                c.drawRect(left, top, right, bottom, paint);
            }
        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
//        int childCount = parent.getChildCount();
//        int left = parent.getPaddingLeft();
//        int right = parent.getMeasuredWidth() - parent.getPaddingRight();
//        for (int i = 0; i < childCount; i++) {
//            View child = parent.getChildAt(i);
//            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
//            int top = child.getBottom() + layoutParams.bottomMargin;
//            int bottom = top + 10;
//            c.drawRect(left, top, right, bottom, paint);
//        }
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildAdapterPosition(view) == 0) {
            return;
        } else {
            outRect.set(0, 0, 0, DIVIDER_HEIGHT);
            Log.e("getItemOffsets", parent.getChildAdapterPosition(view) + "");
            Log.e("getChildCount", parent.getChildCount() + "");
        }
    }
}
