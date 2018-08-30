package com.example.ahmedosman.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListActivity extends ThemeHeaderFragmentActivity {
    public int getHeaderDrawableID() {
        return R.drawable.;
    }

    @Override
    public Fragment createFragment(){
        return new ListFragment();
    }
}
