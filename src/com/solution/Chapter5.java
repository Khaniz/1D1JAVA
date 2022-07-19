package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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


    public void no1065() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(new arithmeticalProgression().hanSu(n));
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

class arithmeticalProgression {

    public int hanSu(int n){
        int result = 0;
        int idx = n;
        int temp = 0;
        while(true){
            idx = idx/10;
            if(idx==0){
                break;
            }
            temp++;
        }

        for(int i = 1; i<=n; i++){
            int space = i;
            int spaceCnt = 0;
            while(true){
                space = space/10;
                if(space==0){
                    break;
                }
                spaceCnt++;
            }
            int anotherTemp = i;

            if(spaceCnt > 1){
                List<Integer> arithProgression = new ArrayList<>();
                for(int j = 0; j<=temp; j++){

                    int quota = anotherTemp%10;
                    arithProgression.add(quota);
                    anotherTemp = anotherTemp/10;

                }

                int substraction = 0;
                int tempForCompare = temp;
                boolean judgement = false;
                for(int l =1; l<=temp; l++){
                    if(l == 1){
                        substraction = arithProgression.get(tempForCompare)-arithProgression.get(tempForCompare-1);
                    }else {
                        if(substraction == arithProgression.get(tempForCompare)-arithProgression.get(tempForCompare-1)){
                            judgement = true;
                            substraction = arithProgression.get(tempForCompare)-arithProgression.get(tempForCompare-1);
                        }else {
                            judgement = false;
                        }
                    }

                    tempForCompare--;

                }

                if(judgement){
                    result++;
                }

            }else {
                result++;
            }


        }

        return result;
    }

}