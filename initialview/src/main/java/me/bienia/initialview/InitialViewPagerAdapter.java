package me.bienia.initialview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by sawcioo on 29.11.14.
 */
public class InitialViewPagerAdapter extends FragmentStatePagerAdapter{

    private Context mContext;
    private ArrayList<InitialViewPage> mPages;

    public InitialViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return mPages != null ? mPages.size() : 0;
    }

    @Override
    public Fragment getItem(int i) {
        return createFragment(mPages.get(i));
    }

    private Fragment createFragment(InitialViewPage initialViewPage) {
        InitialViewFragment fragment = new InitialViewFragment();

        fragment.setPageInfo(initialViewPage);

        return fragment;
    }

    public void setPages(ArrayList<InitialViewPage> pages) {
        this.mPages = pages;
    }
}
