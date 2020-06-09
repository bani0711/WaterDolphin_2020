package com.example.waterdolphin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentGraph extends Fragment {

    ViewGroup viewGroup;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //일단 비워뒀음
    }

    //프래그먼트 연결부분
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_graph, container, false);
        return viewGroup;
    }
}