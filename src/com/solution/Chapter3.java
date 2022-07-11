package com.solution;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chapter3 {

    public void no2739(){

        Scanner getInt = new Scanner(System.in);
        int a = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 1 & a <= 9) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 9보다 작거나 같은 정수를 입력하세요");
            }

        }
        getInt.close();

        for(int i = 1; i<=9; i++){

            System.out.println(a +" * "+ i +" = "+ a*i);
        }

    }

    public void no10950(){
        Scanner getInt = new Scanner(System.in);
        int t = 0;
        while (true) {
            t = getInt.nextInt();
            if (t >= 1) {
                break;
            } else {
                System.out.println("1 이상의 횟수를 입력해주세요");
            }

        }
        for(int i = 1; i<=t; i++ ){

            int a = 0;
            int b = 0;
            while (true) {
                a = getInt.nextInt();
                if (a > 0) {
                    break;
                } else {
                    System.out.println("A > 0");
                }

            }
            while (true) {
                b = getInt.nextInt();
                if (b > 0) {
                    break;
                } else {
                    System.out.println("B > 0");
                }

            }

            System.out.println(a+b);

        }


        getInt.close();
    }

    public void no8393(){
        Scanner getInt = new Scanner(System.in);
        int a = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 1 & a <= 10000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 10,000보다 작거나 같은 정수를 입력하세요");
            }

        }
        getInt.close();

        int sum = 0;
        for(int i = 1; i<=a; i++){
            sum += i;
        }

        System.out.println(sum);
    }

    public void no15552() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 1000000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 1,000,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i= 1; i<=a; i++){
            int targetA = 0;
            int targetB = 0;
            while(true){
                String str = br.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                targetA = Integer.parseInt(stringTokenizer.nextToken());
                targetB = Integer.parseInt(stringTokenizer.nextToken());
                if((targetA >=1 & targetA <= 1000) & (targetB >=1 & targetB <= 1000)){

                    break;
                }else {
                    System.out.println("다시 입력해주세요");
                }
            }

            bw.write(targetA+targetB+"\n");

        }

        bw.flush();
        bw.close();
    }

    public void no2741() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 100000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 100,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i= 1; i<=a; i++){
            bw.write(i+"\n");
        }

        bw.flush();
        bw.close();

    }
    public void no2742() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 100000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 100,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i= 0; i<a; i++){
            bw.write(a-i+"\n");
        }

        bw.flush();
        bw.close();

    }

    public void no11021() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 100000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 100,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i= 1; i<=a; i++){
            int targetA = 0;
            int targetB = 0;
            while(true){
                String str = br.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                targetA = Integer.parseInt(stringTokenizer.nextToken());
                targetB = Integer.parseInt(stringTokenizer.nextToken());
                if((targetA > 0 & targetA < 10) & (targetB > 0 & targetB < 10)){
                    break;
                }else {
                    System.out.println("다시 입력해주세요");
                }
            }
            bw.write("Case #"+i+": ");
            bw.write(targetA+targetB+"\n");
        }

        bw.flush();
        bw.close();

    }

    public void no11022() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 100000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 100,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i= 1; i<=a; i++){
            int targetA = 0;
            int targetB = 0;
            while(true){
                String str = br.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                targetA = Integer.parseInt(stringTokenizer.nextToken());
                targetB = Integer.parseInt(stringTokenizer.nextToken());
                if((targetA > 0 & targetA < 10) & (targetB > 0 & targetB < 10)){
                    break;
                }else {
                    System.out.println("다시 입력해주세요");
                }
            }
            bw.write("Case #"+i+": ");
            bw.write(targetA+" + "+targetB+" = "+ (targetA+targetB) +"\n");
        }

        bw.flush();
        bw.close();
    }

    public void no2438() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 100000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 100,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for(int i= 1; i<=a; i++){
            for(int j= 1; j<=i; j++){
                if(j==i){
                    bw.write("*"+"\n");
                }else {
                    bw.write("*");
                }
            }
        }

        bw.flush();
        bw.close();
    }

    public void no2439() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            String T = br.readLine();
            a = Integer.parseInt(T);
            if (a >= 1 & a <= 100000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 100,000보다 작거나 같은 정수를 입력하세요");
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for(int i= 1; i<=a; i++){
            for(int ij=(a-i); ij>0; ij--){
                bw.write(" ");
            }
            for(int j= 1; j<=i; j++){
                if(j==i){
                    bw.write("*"+"\n");
                }else {
                    bw.write("*");
                }
            }
        }

        bw.flush();
        bw.close();
    }








}
