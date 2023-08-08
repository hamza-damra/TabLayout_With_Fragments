package com.example.tablayout;

import androidx.fragment.app.Fragment;

public class MyTab {
    private Category category;
    private CategoryFragment fragment;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(CategoryFragment fragment) {
        this.fragment = fragment;
    }

    public MyTab(Category category, CategoryFragment fragment) {
        this.category = category;
        this.fragment = fragment;
        fragment.setName(category.getName());

    }
}
