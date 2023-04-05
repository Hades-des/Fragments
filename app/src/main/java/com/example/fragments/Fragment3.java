package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    private ImageView imageView;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;

    public Fragment3() {
        // Необходимый констркутор
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Задаем Макет
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        imageView = view.findViewById(R.id.imageView);
        checkBox1 = view.findViewById(R.id.checkBox1);
        checkBox2 = view.findViewById(R.id.checkBox2);
        checkBox3 = view.findViewById(R.id.checkBox3);

        imageView.setImageResource(R.drawable.image_3);//задаем картинку

        return view;
    }

}

