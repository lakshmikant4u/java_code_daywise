package com.day3;

import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String data = "Java,Spring,SQL,HTML";
        StringTokenizer st = new StringTokenizer(data, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
