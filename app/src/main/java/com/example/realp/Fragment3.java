package com.example.realp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ActionBar actionBar = ((MainActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("프로젝트 목록");

        return inflater.inflate(R.layout.frag3,container,false);
    }
}
