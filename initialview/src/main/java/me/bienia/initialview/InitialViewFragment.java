package me.bienia.initialview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sawcioo on 29.11.14.
 */
public class InitialViewFragment extends Fragment {
    private InitialViewPage pageInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_initial_view, null);

        return rootView;
    }

    public void setPageInfo(InitialViewPage pageInfo) {
        this.pageInfo = pageInfo;
    }
}
