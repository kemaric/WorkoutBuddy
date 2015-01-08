package com.ksl.owner.amifit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Owner on 9/22/2014.
 */
public class SearchTab extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance){
        View view = inflater.inflate(R.layout.search_page, container,false);
        return view;
    }
}
