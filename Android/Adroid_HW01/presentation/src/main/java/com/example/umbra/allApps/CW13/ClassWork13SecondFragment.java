package com.example.umbra.allApps.CW13;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.umbra.allApps.R;

public class ClassWork13SecondFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second_cw13, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //здесь нужно делать все кнопики, методы и онкликлистенеры. он специально
        //создан для этого

        super.onViewCreated(view, savedInstanceState);
    }


    /**
     * вызывает после того как создалось активити
     * дает доступ к активити, который вызвал этот фрагменты getActivity()
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    /*
    довлен на активити
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /*
    удален с активити
     */
    @Override
    public void onDetach() {
        super.onDetach();
    }


    /*
    Вызывается, когда наш фрагмент закрывается или перекрывается
     */

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
