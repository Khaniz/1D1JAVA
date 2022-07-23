package com.solution;

import java.io.*;
import java.util.ArrayList;

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

}
