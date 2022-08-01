package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter7 {

    public void no1712() throws IOException {
        //손익분기점

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        br.close();

        int fixedCost = Integer.parseInt(st.nextToken());
        int dynamicCost = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int result = 0;
        if(price <= dynamicCost){
            result = -1;
        }else{
            result = (int) Math.ceil( (double) fixedCost / (double) (price-dynamicCost));
            if((price-dynamicCost)*result == fixedCost){
                result++;
            }
        }

        System.out.println(result);
    }
    public void no2292() throws IOException {
        //벌집
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        br.close();

        for(int i = 0; i< 333333; i++){
            if( input == 1){
                System.out.println(1);
                break;
            }
            else if(3*i*(i+1)+1>=input){
                System.out.println(i+1);
                break;
            }

        }
    }
    public void no1193() throws IOException {
        //분수찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        br.close();

        int leftOver = 0;
        int quota = 0;

        if(input <= 3){


            switch (input){
                case 1:
                    System.out.println("1/1");
                    break;
                case 2:
                    System.out.println("1/2");
                    break;
                case 3:
                    System.out.println("2/1");
                    break;
            }
        }else{
            for(int i = 2; i< 333333; i++){
                if( i * (i-1) < 2 * input && 2 * input <= i * (i+1) ){
                    leftOver = input-(i*(i-1))/2;
                    quota = i;
                    break;
                }
            }
            if(quota % 2 == 1){
                System.out.println((quota - leftOver+1) +"/"+ leftOver);
            }else{
                System.out.println(leftOver + "/" + (quota-leftOver+1));
            }
        }
    }
    public void no2869(){
        //달팽이는 올라가고 싶다
    }
    public void no10250(){
        //ACM 호텔
    }
    public void no2775(){
        //부녀회장이 될테야
    }
    public void no2839(){
        //설탕 배달
    }
    public void no10757(){
        //큰 수 A+B
    }
}
