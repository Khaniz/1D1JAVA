package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Chapter8 {

    public void no1978() throws IOException {
        //소수찾기
        int primeNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int triedCnt = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<triedCnt; i++){
            int target = Integer.parseInt(st.nextToken());
            if(isPrime(target)){
                primeNumber++;
            }
        }

        br.close();
        System.out.println(primeNumber);
    }

    public void no2581() throws IOException {
        //소수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> number = new ArrayList<>();
        for(int i = M; i<=N; i++){
            if(isPrime(i)){
                number.add(i);
            }
        }

        br.close();
        if(number.size() == 0){
            System.out.println(-1);
        }else{
            int sum = 0;
            for(int target : number){
                sum += target;
            }
            System.out.println(sum);
            System.out.println(number.get(0));
        }

    }

    public void no11653() throws IOException {
        //소인수분해
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1; i<=N; i++){
            if(isPrime(i)){
                number.add(i);
            }
        }

        br.close();

        for(int target : number){
            while(N%target == 0){
                N = N/target;
                System.out.println(target);
            }
        }

    }

    public void no1929() {
        //소수 구하기
    }

    public void no4948() {
        //베르트랑 공준
    }

    public void no920() {
        //골드바흐의 추측
    }

    // 소수 판별 메소드
    public static boolean isPrime(int target) {
        if(target < 2) {
            return false;
        }

        // 2 는 소수다
        if(target == 2) {
            return true;
        }
        // 제곱근 함수 : Math.sqrt()
        for (int i = 2; i <= Math.sqrt(target); i++) {
            if(target % i == 0){
                return false;
            }
        }
        return true;

    }

}
