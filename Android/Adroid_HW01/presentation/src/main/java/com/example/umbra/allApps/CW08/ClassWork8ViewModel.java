package com.example.umbra.allApps.CW08;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.os.AsyncTask;
import android.util.Log;

import com.example.umbra.allApps.HW07.Activity_HomeWork07;
import com.example.umbra.allApps.base.BaseViewModel;


public class ClassWork8ViewModel implements BaseViewModel {

    public ObservableField<String> helloText = new ObservableField<>("Hello!");
    public Activity activity;


    public ClassWork8ViewModel(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    public void onSuperButtonClick() {

        Log.e("BBB", "Click");
        Intent intent = new Intent(activity, Activity_HomeWork07.class);
        activity.startActivity(intent);

    }

        //нужно использовать только для быстрых задач
        //проблем в том, что очень сложно убить процесс, если мы ушли с активити
    public class MyAsyncTask extends AsyncTask<Void, Integer, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        //ыпполняется перез методом doInBackground и выполняется в UI потоке
            //выполняется как вызвали start
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);


//            выполняется в UI потоке, но его нужно вызывать самостоятельно из doInBackground
        }

        @Override
        protected String doInBackground(Void... params) {

            //весть код в этом методе будет выполнен в другом потоке

            //затем передает эти данные в onPostExecute(), который будет выполняться в UI потоке
            //из другого потока нелья изменить данные в UI потоке


            publishProgress(30); //вызвать метод onProgressUpdate
            return "";
        }

        //метод выполнится в UI потоке
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //тут все выполняется в UI потоке.
//        входное значение s передается из метолда doInBackground
        }
    }


}
