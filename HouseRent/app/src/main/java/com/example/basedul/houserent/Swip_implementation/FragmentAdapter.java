package com.example.basedul.houserent.Swip_implementation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.basedul.houserent.TabList.Experiences;
import com.example.basedul.houserent.TabList.Homes;
import com.example.basedul.houserent.TabList.Resturents;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public FragmentAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                Homes homes = new Homes();
                return homes;
            case 1:
                Experiences experiences = new Experiences();
                return experiences;
            case 2:
                Resturents resturents = new Resturents();
                return resturents;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
