package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    ArrayList<MyTab> tabs;
    FragmentManager fragmentManager;

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, ArrayList<MyTab> tabs) {
        super(fragmentManager);
        this.fragmentManager = fragmentManager;
        this.tabs = tabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return tabs.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return  tabs.get(position).getCategory().getName();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
