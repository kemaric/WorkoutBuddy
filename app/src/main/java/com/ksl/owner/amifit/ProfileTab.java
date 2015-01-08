package com.ksl.owner.amifit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by Kemari on 9/22/2014.
 */

public class ProfileTab extends Fragment {

    private Button editB, saveB;
    private EditText nameText, locationText, ageText, aboutMeText;
    private ImageButton profilePic;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance){
        //Setting up the fragment's view and the objects in the fragment
        View view = inflater.inflate(R.layout.profile_page, container,false);
        editB = (Button)view.findViewById(R.id.editProfileButton);
        saveB = (Button)view.findViewById((R.id.saveProfileButton));
        nameText = (EditText)view.findViewById(R.id.fullNameText);
        locationText = (EditText)view.findViewById(R.id.locationText);
        ageText = (EditText)view.findViewById(R.id.personAge);
        aboutMeText = (EditText)view.findViewById(R.id.aboutMeText);

        /*The visibility for the save button is set to gone since it's only suppose to be used when
        * the profile is being edited. The editability for the text fields should also only
        * on when the edit button is clicked.*/
        saveB.setVisibility(View.GONE);
        nameText.setKeyListener(null);
        locationText.setKeyListener(null);
        ageText.setKeyListener(null);
        aboutMeText.setKeyListener(null);

        editB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveB.setVisibility(View.VISIBLE);
                nameText.setKeyListener((KeyListener) nameText.getTag());
                locationText.setKeyListener((KeyListener)locationText.getTag());
                ageText.setKeyListener((KeyListener)ageText.getTag());
                ageText.setInputType(InputType.TYPE_CLASS_NUMBER);
                aboutMeText.setKeyListener((KeyListener)aboutMeText.getTag());

            }
        });

        saveB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                saveB.setVisibility(View.GONE);
                nameText.setKeyListener(null);
                locationText.setKeyListener(null);
                ageText.setKeyListener(null);
                aboutMeText.setKeyListener(null);
            }
        });
        return view;

    }
}
