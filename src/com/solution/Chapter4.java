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

    public void no1546() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        List<Integer> resultList = new ArrayList<>();

        int subjectCnt = 0;
        while(true){
            subjectCnt = Integer.parseInt(br.readLine());
            if(subjectCnt>0 & subjectCnt<=1000){
                break;
            }else {
                System.out.println("적절한 과목 숫자를 입력해주세요 (1000개 이하)");
            }
        }

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for(int i = 0; i<subjectCnt; i++){
            while(true){
                a = Integer.parseInt(tokenizer.nextToken());

                if(a>=0 & a<=100){
                    resultList.add(a);
                    break;
                }else{
                    System.out.println("범위를 벗어난 입력값 입니다. (범위 : 0~100)");
                }
            }
        }
        br.close();

        int max = resultList.get(0);
        for(int i=0; i< resultList.size(); i++){
            if(resultList.get(i) > max){
                max = resultList.get(i);
            }
        }


        double avg = 0L;
        for(int score : resultList){
            avg += (score/(double)max)*100;
        }
        System.out.println(avg/subjectCnt);

    }
}
