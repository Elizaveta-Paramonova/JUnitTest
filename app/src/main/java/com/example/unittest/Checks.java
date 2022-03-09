package com.example.unittest;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checks {
    public static boolean checkEmailForValidity(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);


    public static boolean checkPasswordForValidity(String password){
        boolean VALID_PASSWORD = false;
        if (password.length() >= 7 && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*") && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%<>+_-].*") ) VALID_PASSWORD = true;
        return VALID_PASSWORD;
    }
}
