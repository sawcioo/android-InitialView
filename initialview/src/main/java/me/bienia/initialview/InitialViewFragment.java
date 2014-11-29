package me.bienia.initialview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sawcioo on 29.11.14.
 */
public class InitialViewFragment extends Fragment {
    private InitialViewPage pageInfo;

    private TextView mTitleTextView;
    private TextView mDescriptionTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_initial_view, null);

        mTitleTextView = (TextView) rootView.findViewById(R.id.titleTextView);
        mDescriptionTextView = (TextView) rootView.findViewById(R.id.descriptionTextView);

        return rootView;
    }

    public void setPageInfo(InitialViewPage pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public void onResume() {
        super.onResume();

        if(pageInfo != null)
        {
            if(pageInfo.getTitle() != null)
            {
                mTitleTextView.setText(pageInfo.getTitle());
            }

            mTitleTextView.setTextSize(pageInfo.getTitleTextSize());

            if(pageInfo.getDescription() != null)
            {
                mDescriptionTextView.setText(pageInfo.getDescription());
            }

            mDescriptionTextView.setTextSize(pageInfo.getDescriptionTextSize());
        }
    }
}
