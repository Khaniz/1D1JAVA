package com.solution;

import java.util.Scanner;

public class Solution2 {

    public void no1330(){

        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();
        getInt.close();

        if(a>b){
            System.out.println(">");
        }else if (a<b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }

    }

    public void no9498(){

        Scanner getInt = new Scanner(System.in);
        int a = 0;

        while(true){
            a = getInt.nextInt();
            if(a >= 0 & a <= 100){
                break;
            }
            else {
                System.out.println("0보다 크거나 같고, 100보다 작거나 같은 정수를 입력하세요");
            }

        }
        getInt.close();

        switch (a/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

    }

    public void no2753(){
        Scanner getInt = new Scanner(System.in);
        int a = 0;

        while(true){
            a = getInt.nextInt();
            if(a >= 1 & a <= 4000){
                break;
            }
            else {
                System.out.println("1보다 크거나 같고, 4000보다 작거나 같은 자연수를 입력하세요");
            }

        }
        getInt.close();

        if(a%4 == 0 & (a%400 == 0 | a%100 != 0) ){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }

    public void no14681(){
        Scanner getInt = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while(true){
            a = getInt.nextInt();
            if(a >= -1000 & a <= 1000 & a != 0){
                break;
            }
            else {
                System.out.println("x는 -1000보다 크고 1000보다 작은 0이 0이 아닌 정수여야합니다.");
            }

        }

        while(true){
            b = getInt.nextInt();
            if(b >= -1000 & b <= 1000 & b != 0){
                break;
            }
            else {
                System.out.println("y는 -1000보다 크고 1000보다 작은 0이 0이 아닌 정수여야합니다.");
            }

        }
        getInt.close();

        if(a>0){
            if(b>0){
                System.out.println("1");
            }else {
                System.out.println("4");
            }

        }else {
            if(b>0){
                System.out.println("2");
            }else {
                System.out.println("3");
            }
        }
    }
}
