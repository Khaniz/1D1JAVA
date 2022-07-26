package com.solution;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chapter6 {

    public void no11654() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        br.close();

        System.out.println((int)n.charAt(0));
    }

    public void no11720() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String numbers = br.readLine();
        br.close();

        int result = 0;
        char[] numberList = numbers.toCharArray();
        for(char no : numberList){
            result += Integer.parseInt(String.valueOf(no));
        }

        System.out.println(result);
    }

    public void no10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        br.close();

        char[] word = n.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<>();
        for(int i=0; i<26; i++){
            alphabet.add((char)(i+97));
        }
        for(int i = 0; i<alphabet.size(); i++){
            boolean isExist = false;
            for(int l = 0; l< word.length; l++){
                if(alphabet.get(i) == word[l]){
                    bw.write(l+" ");
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                bw.write(-1+" ");
            }
        }


        bw.flush();
        bw.close();
    }

    public void no2675() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int l = 0; l<t; l++){
            String n = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(n);
            int count = Integer.parseInt(tokenizer.nextToken());
            String target = tokenizer.nextToken();

            char[] desolvedTarget = target.toCharArray();
            for(char unit : desolvedTarget){
                for(int i = 0; i<count; i++){
                    bw.write(unit);
                }
            }
            bw.write("\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }

    public void no1157(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] spells = input.toCharArray();
        String alphabet = "";
        int sur = 0;
        for(char spell : spells){
            int pre = 0;
            for(char sp : spells){
                if(String.valueOf(spell).equalsIgnoreCase(String.valueOf(sp))){
                    pre++;
                }
            }

            if(pre > 0 && sur < pre){
                sur = pre;
                alphabet = String.valueOf(spell);
            }else if(sur == pre && !String.valueOf(spell).equalsIgnoreCase(alphabet)){
                alphabet = "?";
            }

        }
        System.out.println(alphabet.toUpperCase());
    }

    public void no1152() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        System.out.print(st.countTokens());

        // 상단 내용만 정답으로 출력되는데, 하단의 내용이 정답이 될수 있는 이유를
        // 알아내지 못했음.

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        br.close();
//
//        System.out.print(input.strip().split("\\s+").length);
    }

}
