package com.example.basedul.classroutine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            ClassRoutine classRoutine = new ClassRoutine();
            return classRoutine;
        }else if(i==1) {
            Assignments assignments = new Assignments();
            return assignments;
        }else if(i==2) {
            Notes notes = new Notes();
            return notes;
        }else{
            return null;
        }
//        DemoFragment demoFragment = new DemoFragment();
//        i+=1;
//        Bundle bundle = new Bundle();
//        bundle.putString("message", "Fragment = "+i);
//        demoFragment.setArguments(bundle);
//        return  demoFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        /*position+=1;
        return "Fragment "+position;*/
        switch (position){
            case 0:
                return "Class Routine";
            case 1:
                return "Assignment";
            case 2:
                return "Notes";
            default:
                return null;
        }
    }
}
