package com.devstromo.secure_tester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecureTester {
    private static final Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
    public static boolean alphanumeric(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
