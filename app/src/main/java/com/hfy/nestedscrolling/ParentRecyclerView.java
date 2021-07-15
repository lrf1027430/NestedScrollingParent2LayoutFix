package com.hfy.nestedscrolling;

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
public class ParentRecyclerView extends RecyclerView {

    public ParentRecyclerView(@NonNull Context context) {
        super(context);
    }

    public ParentRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ParentRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean a1 = super.onInterceptTouchEvent(ev);
        Log.d("aabbParentRecyclerView", "onInterceptTouchEvent =" + a1 + " ev = " + ev.getAction());
        return a1;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean a1 = super.onTouchEvent(ev);
        Log.d("aabbParentRecyclerView", "onTouchEvent =" + a1 + " ev = " + ev.getAction());
        return a1;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean a1 = super.dispatchTouchEvent(ev);
        Log.d("aabbParentRecyclerView", "dispatchTouchEvent =" + a1 + " ev = " + ev.getAction());
        return a1;
    }
}
