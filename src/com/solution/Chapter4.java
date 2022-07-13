package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Chapter4 {

    public void no10818() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        List<Integer> strings = new ArrayList<>();
        for(int i = 0; i<Integer.parseInt(n); i++){
            Integer x = Integer.parseInt(tokenizer.nextToken());
            strings.add(x);
        }

        strings.stream().min(Comparator.comparing(a -> a)).ifPresent(s-> System.out.print(s+" "));
        strings.stream().max(Comparator.comparing( a -> a)).ifPresent(s-> System.out.print(s));
    }
}
