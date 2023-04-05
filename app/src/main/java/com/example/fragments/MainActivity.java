package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Объекты класса ImageButton для кнопок фрагментов
    private ImageButton fragment1Button;
    private ImageButton fragment2Button;
    private ImageButton fragment3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Установка макета для активности

        // Получение ссылок на объекты ImageButton
        fragment1Button = findViewById(R.id.fragment1_button);
        fragment2Button = findViewById(R.id.fragment2_button);
        fragment3Button = findViewById(R.id.fragment3_button);

        // Задание обработчиков кликов на кнопки фрагментов
        fragment1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создание и отображение фрагмента Fragment1
                Fragment fragment = new Fragment1();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment);
                transaction.commit();
            }
        });

        fragment2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создание и отображение фрагмента Fragment2
                Fragment fragment = new Fragment2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment);
                transaction.commit();
            }
        });

        fragment3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создание и отображение фрагмента Fragment3
                Fragment fragment = new Fragment3();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment);
                transaction.commit();
            }
        });

        // Отображение первого фрагмента при запуске приложения
        Fragment fragment = new Fragment1();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}

