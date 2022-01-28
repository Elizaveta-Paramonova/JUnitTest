package com.example.unittest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testIsEmailValid() {
        String testEmail = "wdad@mail.ru";
        Assert.assertThat(String.format("Email невалидный %s ", testEmail),
                Checks.checkEmailForValidity(testEmail), is(true));
    }
    @Test
    public void testIsLogin() {
        String testPassword = "asdAS23#1";
        Assert.assertThat(String.format("Пароль невалидный %s ", testPassword),
                Checks.checkPasswordForValidity(testPassword), is(true));
    }
}
