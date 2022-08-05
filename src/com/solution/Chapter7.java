package com.solution;

import java.io.*;
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
    public void no2869() throws IOException {
        //달팽이는 올라가고 싶다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        br.close();

        int tempDaily = 0;
        for(int i = 1; i<v; i++){
            if(i*a - (i-1)*b >= v){
                tempDaily = i;
                break;
            }
        }

        System.out.println(tempDaily);
    }
    public void no10250() throws IOException {
        //ACM 호텔
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i< cnt; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());


            int surNo = 0;
            int preNo = 0;
            if(N % H == 0){
                preNo = H;
                surNo = (N / H);
            }else{
                preNo = N % H;
                surNo = (N / H)+1;
            }

            String roomNumber = "";
            if(surNo<10){
                roomNumber = Integer.toString(preNo)+"0"+Integer.toString(surNo);
            }else {
                roomNumber = Integer.toString(preNo)+Integer.toString(surNo);
            }

            if(i+1 == cnt){
                bw.write(roomNumber);
            }else{
                bw.write(roomNumber+"\n");
            }
        }
        br.close();

        bw.flush();
        bw.close();
    }
    public void no2775() throws IOException {
        //부녀회장이 될테야
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i< cnt; i++){
            int floor = Integer.parseInt(br.readLine());
            int roomNo = Integer.parseInt(br.readLine());

            long tempPersons = 1;
            for(int j = 1; j<=floor; j++){
                tempPersons = firstRoomPersons(tempPersons, roomNo);
            }
            String persons = String.valueOf(tempPersons);
            if(i==(cnt-1)){
                bw.write(persons);
            }else {
                bw.write(persons+"\n");
            }
        }
        br.close();

        bw.flush();
        bw.close();
    }
    public void no2839(){
        //설탕 배달
    }
    public void no10757(){
        //큰 수 A+B
    }

    private static long firstRoomPersons(long tempPersons, int roomNo){
        long persons = 0;
        if(tempPersons == 1){
            persons = (1+roomNo)*roomNo/ 2;
        }else{
            persons = (1+tempPersons)*roomNo/ 2;
        }

        return persons;
    }
}
