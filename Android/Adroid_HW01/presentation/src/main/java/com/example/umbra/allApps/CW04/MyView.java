package com.example.umbra.allApps.CW04;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

import com.example.umbra.allApps.R;


public class MyView extends View {

    //это что-то вроде кисти в фотошопе
    private Paint myPaint = new Paint();

    //для рамки
    //  private RectF arcRectF = new RectF();


    int cx;
    int cy;


    public MyView(Context context) {
        super(context);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }

    //метод для инициализации своей собственной вью
    private void initialize() {
        //        сглаживаем пиксиели
        myPaint.setAntiAlias(true);
        int color = ContextCompat.getColor(getContext(), R.color.blue);
        myPaint.setColor(color);
        myPaint.setStyle(Paint.Style.STROKE);

//ширина окантовки строке
        Resources r = getResources();
        float strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                2, r.getDisplayMetrics());
        myPaint.setStrokeWidth(strokeWidthInPx);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //здесь нужно минимально делать перериовку т.к. тратится много рисурсов.
        // не нужно создавать здесь объекты, лучше создать их зарание.


//  здесь не должно быть никакого хардкода
        //canvas - по размерам своей вью
//        int cx = getWidth() / 2;
//        int cy = getHeight() / 2;
        int radius = Math.min(getWidth(), getHeight()) / 8;
        canvas.drawCircle(cx, cy, radius, myPaint);


////   рисуем линию
//        int startX = 0;
//        int startY = 0;
//        int stopX = getWidth();
//        int stopY = getHeight();
//        canvas.drawLine(startX, startY, stopX, stopY, myPaint);
//
//
//
//        arcRectF.left = 0;
//        arcRectF.top = 0;
//        arcRectF.right = getWidth();
//        arcRectF.bottom = getHeight();
//
//     canvas.drawArc(arcRectF, 0,-90,true, myPaint);
//
//
//        canvas.drawRect(50,50,100, 100, myPaint);


    }


    //метод загружается при изменении вю.
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }


    //определяет начальные значения элемента вью
//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//
//    }


    //метод срабатывает при нажатии на вью
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_MOVE) {

            cx = (int) event.getX();
            cy = (int) event.getY();
            //метод перерисовки экрана
            invalidate();

        } else if (event.getAction() == MotionEvent.ACTION_UP) {

        } else if (event.getAction() == MotionEvent.ACTION_DOWN) {


        }
        return true;
    }
}
