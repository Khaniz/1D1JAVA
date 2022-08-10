package com.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public void no2581() {
        //소수
    }

    public void no11653() {
        //소인수분해
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
