package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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

    public void no2562() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<9; i++){
            int n = Integer.parseInt(br.readLine());
            numbers.add(i, n);
        }

        AtomicInteger value = new AtomicInteger();
        numbers.stream().max(Comparator.comparing( a -> a)).ifPresent(s-> value.set(s));

        System.out.println(value);
        System.out.println(numbers.indexOf(Integer.parseInt(String.valueOf(value)))+1);
    }

    public void no2577() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        int c = 0;

        while(true){
            a = Integer.parseInt(br.readLine());
            if(a>=100 & a<1000){
                break;
            }
        }
        while(true){
            b = Integer.parseInt(br.readLine());
            if(b>=100 & b<1000){
                break;
            }
        }
        while(true){
            c = Integer.parseInt(br.readLine());
            if(c>=100 & c<1000){
                break;
            }
        }

        br.close();
        int result = a*b*c;

        List<String> resultList = new ArrayList<>();
        for(int i = 0; i<Integer.toString(result).length(); i++){
            resultList.add(String.valueOf(Integer.toString(result).charAt(i)));
        }

        System.out.println(Collections.frequency(resultList, "0"));
        System.out.println(Collections.frequency(resultList, "1"));
        System.out.println(Collections.frequency(resultList, "2"));
        System.out.println(Collections.frequency(resultList, "3"));
        System.out.println(Collections.frequency(resultList, "4"));
        System.out.println(Collections.frequency(resultList, "5"));
        System.out.println(Collections.frequency(resultList, "6"));
        System.out.println(Collections.frequency(resultList, "7"));
        System.out.println(Collections.frequency(resultList, "8"));
        System.out.println(Collections.frequency(resultList, "9"));
    }
}
