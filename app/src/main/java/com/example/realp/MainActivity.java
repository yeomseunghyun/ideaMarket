package com.example.realp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager=getSupportFragmentManager();
    private Fragment1 fragment1=new Fragment1();
    private Fragment2 fragment2=new Fragment2();
    private Fragment3 fragment3=new Fragment3();
    private Fragment4 fragment4=new Fragment4();
    private Fragment5 fragment5=new Fragment5();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //기본 프레그먼트 지정
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout,fragment1).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction=fragmentManager.beginTransaction();
               switch (item.getItemId()){
                   case R.id.sell:
                       transaction.replace(R.id.frameLayout,fragment1).commitAllowingStateLoss();
                       break;
                   case R.id.together:
                       transaction.replace(R.id.frameLayout,fragment2).commitAllowingStateLoss();
                       break;
                   case R.id.project:
                       transaction.replace(R.id.frameLayout,fragment3).commitAllowingStateLoss();
                       break;
                   case R.id.chatting:
                       transaction.replace(R.id.frameLayout,fragment4).commitAllowingStateLoss();
                       break;
                   case R.id.set:
                       transaction.replace(R.id.frameLayout,fragment5).commitAllowingStateLoss();
                       break;
               }
                return true;
            }
        });
    }
}
