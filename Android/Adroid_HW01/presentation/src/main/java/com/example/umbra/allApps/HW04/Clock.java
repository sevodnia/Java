package com.example.umbra.allApps.HW04;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import com.example.umbra.allApps.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Clock extends View {

    //инициализация кисти
    private Paint myPaint = new Paint();
  //  java.util.Calendar calendar = java.util.Calendar.getInstance();
    private java.util.Calendar calendar2;
    float startX;
    float startY;
    float endX;
    float endY;


    private void initialize() {
        //        сглаживаем пиксиели
        myPaint.setAntiAlias(true);
        myPaint.setTextSize(40);


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        for (int i = 0; i < 12; i++) {


            //координаты для первой линии
             startX = (float) getWidth() / 2;
             startY = 0.0f;
             endX = (float) getWidth() / 2;
             endY = (float) getHeight() / 10;


            //рисуем 3, 6, 9, 12 черты другим цветом
            if (i == 3 | i == 6 | i == 9 | i == 0) {
                myPaint.setStrokeWidth(10);
                myPaint.setColor(Color.RED);

            }

            //рисуем черточки
            canvas.drawLine(startX, startY, endX, endY, myPaint);
            canvas.rotate(30, getWidth() / 2, getHeight() / 2);
            myPaint.setStrokeWidth(5);
            myPaint.setColor(Color.BLACK);

            //зафигачиваем цифры
            if (i == 2) {
                canvas.save();
                canvas.rotate(-90, endX, endY * 1.5f);
                myPaint.setTextAlign(Paint.Align.CENTER);
                canvas.drawText("III", endX, endY * 2, myPaint);
                canvas.restore();
            } else if (i == 5) {
                canvas.save();
                canvas.rotate(-180, endX, endY * 1.5f);
                canvas.drawText("VI", endX, endY * 2, myPaint);
                canvas.restore();
            } else if (i == 8) {
                canvas.save();
                canvas.rotate(-270, endX, endY * 1.5f);
                canvas.drawText("IX", endX, endY * 2, myPaint);
                canvas.restore();
            } else if (i == 11) {
                canvas.drawText("XII", endX, endY * 2, myPaint);
            }


        }
//        //стрелки часов
//
//        int m = calendar.get(java.util.Calendar.MINUTE);
//        int h = calendar.get(java.util.Calendar.HOUR);
//
//
//        myPaint.setTextSize(14);
//        myPaint.setTextAlign(Paint.Align.LEFT);
//        canvas.drawText("hour = " + h + " minute = " + m, 0, getHeight(), myPaint);
//        int rotateMultiplexer = h * 60 + m;
//
//        //стрелка часовая
//        canvas.save();
//        canvas.rotate(rotateMultiplexer * 0.5f, getWidth() / 2, getHeight() / 2);
//        canvas.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 10 * 3, myPaint);
//        canvas.restore();
//        //конец часовой стрелки
//
//        //минутная стрелка
//        canvas.save();
//        canvas.rotate(m * 6, getWidth() / 2, getHeight() / 2);
//        canvas.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 10 * 2, myPaint);
//        canvas.restore();
//
//        //секундная стрелка
//        canvas.save();
//        canvas.rotate(calendar.get(java.util.Calendar.SECOND) * 6, getWidth() / 2, getHeight() / 2);
//        myPaint.setStrokeWidth(3);
//        myPaint.setColor(Color.RED);
//        canvas.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 10 * 2, myPaint);
//        canvas.restore();

        for (int i = 0; i < 100; i++) {

            calendar2 = java.util.Calendar.getInstance();


            //секундная стрелка
            canvas.save();
            canvas.rotate(calendar2.get(java.util.Calendar.SECOND) * 6, getWidth() / 2, getHeight() / 2);
            myPaint.setStrokeWidth(3);
            myPaint.setColor(Color.RED);
            canvas.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 10 * 2, myPaint);
            canvas.restore();

            //минутная стрелка
            canvas.save();
            canvas.rotate(calendar2.get(java.util.Calendar.MINUTE) * 6, getWidth() / 2, getHeight() / 2);
            myPaint.setColor(Color.BLACK);
            myPaint.setStrokeWidth(5);
            canvas.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 10 * 2, myPaint);
            canvas.restore();

            //часовая стрелка

            canvas.save();
            canvas.rotate((calendar2.get(java.util.Calendar.HOUR) * 60 + calendar2.get(java.util.Calendar.MINUTE))
                    * 0.5f, getWidth() / 2, getHeight() / 2);
            canvas.drawLine(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 10 * 3, myPaint);
            canvas.restore();


            invalidate();
        }


    }

    public Clock(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Clock(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public Clock(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Clock(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }


}
