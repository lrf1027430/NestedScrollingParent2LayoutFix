package com.hfy.nestedscrolling;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by 123 on 2021/7/15.
 */
public class ViewPagerRecyclerView extends RecyclerView {

    public ViewPagerRecyclerView(@NonNull Context context) {
        super(context);
    }

    public ViewPagerRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewPagerRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("LongLogTag")
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean a1 = super.onInterceptTouchEvent(ev);
        Log.d("aabbViewPagerRecyclerView", "onInterceptTouchEvent =" + a1 + " ev = " + ev.getAction());
        return a1;
    }

    @SuppressLint("LongLogTag")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean a1 = super.onTouchEvent(ev);
        Log.d("aabbViewPagerRecyclerView", "onTouchEvent =" + a1 + " ev = " + ev.getAction());
        return a1;
    }

    @SuppressLint("LongLogTag")
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean a1 = super.dispatchTouchEvent(ev);
        Log.d("aabbViewPagerRecyclerView", "dispatchTouchEvent =" + a1 + " ev = " + ev.getAction());
        return a1;
    }
}
