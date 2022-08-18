package com.solution;

import java.io.*;
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

    public void no1929() throws IOException {
        //소수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = N; i<=M; i++){
            if(isPrime(i)){
                bw.write(i+"\n");
            }

        }
        bw.flush();
        bw.close();
    }

    public void no4948() throws IOException {
        //베르트랑 공준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> number = new ArrayList<>();

        while(true){
            int target = Integer.parseInt(br.readLine());
            if(target == 0){
                for(int unit : number){
                    System.out.println(unit);
                }
                break;
            }else{
                int cnt = 0;
                for(int i = target+1; i<=target*2; i++){
                    if(isPrime(i)){
                        cnt++;
                    }
                }
                number.add(cnt);
            }

        }
    }

    public void no920() throws IOException {
        //골드바흐의 추측
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int laps = Integer.parseInt(br.readLine());
        //conflict what;;
        for(int i=0; i<laps; i++){
            int startNo = Integer.parseInt(br.readLine())/2;
            int startToUp = startNo;
            int startToDown = startNo;
            while(true){
                if(isPrime(startToUp) && isPrime(startToDown)){
                    bw.write(startToDown+" "+startToUp+"\n");
                    break;
                }
                startToUp++;
                startToDown--;
            }

        }

        bw.flush();
        bw.close();
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
