package com.example.pc.unittestapp;

import java.util.Calendar;

/**
 * Created by pc on 17/03/2020.
 */

//User's info
public class SharedPreferenceEntry {

    // Name of the user.
    private final String mName;
    // Date of Birth of the user.
    private final Calendar mDateOfBirth;
    // Email address of the user.
    private final String mEmail;
    public SharedPreferenceEntry(String name, Calendar dateOfBirth, String email) {
        mName = name;
        mDateOfBirth = dateOfBirth;
        mEmail = email;
    }
    public String getName() {
        return mName;
    }
    public Calendar getDateOfBirth() {
        return mDateOfBirth;
    }
    public String getEmail() {
        return mEmail;
    }
}
