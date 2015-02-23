package com.ksl.owner.fitniche;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Created by Owner on 9/22/2014.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter{
    final int PAGE_COUNT = 3;
    // Tab Titles
    private String tabtitles[] = new String[] { "Profile", "Buddies", "Search" };
    Context context;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            // Open FragmentTab1.java
            case 0:
                ProfileTab profileTab = new ProfileTab();
                return profileTab;

            // Open FragmentTab2.java
            case 1:
                BuddiesTab buddiesTab = new BuddiesTab();
                return buddiesTab;

            // Open FragmentTab3.java
            case 2:
                SearchTab searchTab = new SearchTab();
                return searchTab;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
