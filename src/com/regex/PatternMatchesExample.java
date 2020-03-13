package com.regex;

import java.util.regex.Pattern;

public class PatternMatchesExample {
	public static void main(String[] args) {

        String text    =
            "This is the text to be searched " +
            "for occurrences of the pattern.";

        String pattern = ".*occurrences of the.*";

        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
    }

}
