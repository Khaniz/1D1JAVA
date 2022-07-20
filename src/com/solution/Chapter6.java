package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6 {

    public void no11654() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        br.close();

        System.out.println((int)n.charAt(0));
    }

}
