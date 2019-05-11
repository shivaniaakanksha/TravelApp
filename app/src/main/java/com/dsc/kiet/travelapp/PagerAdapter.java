package com.dsc.kiet.travelapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs ;

    public PagerAdapter(FragmentManager fm,int NumberOfTabs){
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i)
        {

            case 0:
                live_location tab1 = new live_location();
                return tab1;
            case 1:
                home_screen tab2 = new home_screen();
                return  tab2;
            case 2:
                call_tab tab3 = new call_tab();
                return  tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
