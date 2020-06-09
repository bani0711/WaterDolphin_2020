package com.example.waterdolphin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentSetting extends Fragment {

    ViewGroup viewGroup;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //프래그먼트 연결부분
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_setting, container, false);
        return viewGroup;
    }
}