package com.ksl.owner.fitniche;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by Owner on 9/22/2014.
 */
public class SearchTab extends Fragment {
    private FragmentManager searchFragManager;
    private FrameLayout searchFrameLayout, resultFrameLayout;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance){
        super.onCreateView(inflater,container,savedInstance);
        View view = inflater.inflate(R.layout.search_page, container,false);


        return view;
    }
}
