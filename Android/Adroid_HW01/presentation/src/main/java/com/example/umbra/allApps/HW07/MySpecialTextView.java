package com.example.umbra.allApps.HW07;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;




public class MySpecialTextView extends android.support.v7.widget.AppCompatTextView {


    public MySpecialTextView(Context context) {
        super(context);
        init();
    }

    public MySpecialTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MySpecialTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {

            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/b52.ttf");
            setTypeface(tf);

    }


}
