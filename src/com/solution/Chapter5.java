package com.solution;

import java.util.ArrayList;
import java.util.List;

public class Chapter5 {

    public void no15596(){
        //정수 N개의 합



    }

    public void no4673(){
        List<Integer> selfNums = new ArrayList<>();

        for(int i=0; i<10000; i++){
            int selfNum = new selfNumber().d(i);
            selfNums.add(selfNum);
        }
        int compare = 1;
        for(int i= 0; i<selfNums.size(); i++){

            boolean hasSelfNo = false;
            for(int self : selfNums){
                if(self == compare){
                    hasSelfNo = true;
                }
            }
            if(!hasSelfNo){
                System.out.println(compare);
            }
            compare++;
        }
    }

    public long Test(int[] a){
        long sum = 0;
        for(int i : a){
            sum+= i;
        }
        return sum;
    }
}

class selfNumber {

    public int d(int n){
        int d = n;
        int temp = 0;
        int result = n;

        while(true){
            temp = d%10; // 1의 자리수
            result += temp;

            if(d<10){
                break;
            }
            d = d/10;

        }

        return result;
    }

}
