package com.example.unittest;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void EmailTestFalse() {
        String testEmail = "mail.ru";
        Assert.assertThat(String.format("Email невалидный %s ", testEmail),
                Checks.checkEmailForValidity(testEmail), is(true));
    }

    @Test
    public void PasswordTestFalse() {
        String testPassword = "AS231";
        Assert.assertThat(String.format("Пароль введён не в верном формате %s ", testPassword),
                Checks.checkPasswordForValidity(testPassword), is(true));
    }

    @Test
    public void EmailTestTrue() {
        String testEmail = "wdad@mail.ru";
        Assert.assertThat(String.format("Email невалидный %s ", testEmail),
                Checks.checkEmailForValidity(testEmail), is(true));
    }

    @Test
    public void PasswordTestTrue() {
        String testPassword = "asdAS23#1";
        Assert.assertThat(String.format("Пароль введён не в верном формате %s ", testPassword),
                Checks.checkPasswordForValidity(testPassword), is(true));
    }

    @Test
    public void PasswordANDEmailTestFalse() {
        String testEmail = "wdad@";
        String testPassword = "AS23#1";
        if(Checks.checkEmailForValidity(testEmail) && Checks.checkPasswordForValidity(testPassword)){
            Assert.assertTrue("Проверка пройдена",true);
        }
        else{
            Assert.assertTrue("Email или пароль введены не в верном формате",false);
        }
    }

    @Test
    public void PasswordANDEmailTestTrue() {
        String testEmail = "wdad@mail.ru";
        String testPassword = "asdAS23#1";
        if(Checks.checkEmailForValidity(testEmail) && Checks.checkPasswordForValidity(testPassword)){
            Assert.assertTrue("Проверка пройдена",true);
        }
        else{
            Assert.assertTrue("Email или пароль введены не в верном формате",false);
        }
    }
}
