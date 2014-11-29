package me.bienia.initialview;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by sawcioo on 29.11.14.
 */
public class InitialView extends LinearLayout {

    private ViewPager mPager;
    private ArrayList<InitialViewPage> mPages;
    private InitialViewPagerAdapter mAdapter;

    public InitialView(Context context) {
        super(context);
        init();
    }

    public InitialView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public InitialView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        View rootView = View.inflate(getContext(), R.layout.initial_view, this);

        mPager = (ViewPager) rootView.findViewById(R.id.pager);

        if(getContext() instanceof FragmentActivity) {
            FragmentManager fm = ((FragmentActivity) getContext()).getSupportFragmentManager();

            mAdapter = new InitialViewPagerAdapter(fm);

            mPager.setAdapter(mAdapter);
        }
        else
        {

        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        mAdapter.setPages((ArrayList<InitialViewPage>)mPages.clone());
        mAdapter.notifyDataSetChanged();
    }
}
