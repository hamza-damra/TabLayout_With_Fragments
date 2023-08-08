package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    FragmentAdapter fragmentAdapter;
    ArrayList<MyTab> tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabs = new ArrayList<>();
        tabs.add(new MyTab(new Category(1,"Foods"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(2,"Drinks"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(3,"Crisps"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(4,"Booze"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(1,"Foods"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(2,"Drinks"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(3,"Crisps"),new CategoryFragment()));
        tabs.add(new MyTab(new Category(4,"Booze"),new CategoryFragment()));
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),tabs);
        viewPager.setAdapter(fragmentAdapter);


    }
}