package com.solution;

import java.io.*;
import java.util.*;

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

    public void no2908() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        StringTokenizer st = new StringTokenizer(input);
        String firstNo = st.nextToken();
        String secondNo = st.nextToken();

        char[] firstReverseTool = new char[firstNo.toCharArray().length];
        for(int i = 0; i< firstNo.toCharArray().length; i++){
            firstReverseTool[i]= firstNo.charAt(firstNo.toCharArray().length-1 - i);
        }

        char[] secondReverseTool = new char[secondNo.toCharArray().length];
        for(int i = 0; i< secondNo.toCharArray().length; i++){
            secondReverseTool[i]= secondNo.charAt(secondNo.toCharArray().length-1 - i);
        }

        if(Integer.parseInt(String.valueOf(firstReverseTool)) > Integer.parseInt(String.valueOf(secondReverseTool))){
            System.out.println(firstReverseTool);
        }else {
            System.out.println(secondReverseTool);
        }

    }

    public void no5622() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        //기준정보 : 1을 누르는데 2초 걸림.
        //2~9까지만 할당된 알파벳이 있음
        int required = 0;
        for(int i=0; i<input.length(); i++){
            switch(input.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    required += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    required += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    required += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    required += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    required += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    required += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    required += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    required += 10;
                    break;
                default:
                    required += 2;
                    break;
            }
        }
        System.out.println(required);
    }

    public void no2941() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        //기준정보 :
        //c=
        //c-
        //dz=
        //d-
        //lj
        //nj
        //s=
        //z=
        //아이디어 1 : 해당 첫글자에서 뒷글자를 확인하는 분기를 태우는 방법
        //배열 각 글자 체크해서 분기 태우자
        //뒷글자가 기호인지 확인 d,l,n은 뒷글자가 z,j 확인

        int required = 0;
        int leftOver = input.length();
        char[] spells = input.toCharArray();
        for(int i =1; i<spells.length; i++){

            String pre = String.valueOf(spells[i-1]);
            switch (spells[i]){
                case '=' :
                    if("c".equals(pre) || "s".equals(pre)){
                        required++;
                        leftOver-=2;
                    }else if("z".equals(pre) && i>=2){
                        if("d".equals(String.valueOf(spells[i-2]))){
                            required++;
                            leftOver-=3;
                        }else {
                            required++;
                            leftOver-=2;
                        }
                    }else if("z".equals(pre) && i<2){
                        required++;
                        leftOver-=2;
                    }
                    break;
                case '-' :
                    if("c".equals(pre) || "d".equals(pre)){
                        required++;
                        leftOver-=2;
                    }
                    break;
                case 'j' :
                    if("l".equals(pre) || "n".equals(pre)){
                        required++;
                        leftOver-=2;
                    }
                    break;
            }
        }

        System.out.println(required+leftOver);
    }

    public void no1316() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int series = Integer.parseInt(input);
        for(int i = 0; i< Integer.parseInt(input); i++){
            String word = br.readLine();
            //지나간 이력을 알고 있어야 하고,
            Map<Character, Boolean> history = new HashMap<>();
            //직전 숫자와 현재를 비교하면
            int temp = 0;
            for(int j = 0; j< word.length(); j++){
                if(j>=1){
                    if(history.get(word.charAt(j)) == null){
                        history.put(word.charAt(j), true);
                    }else if(history.get(word.charAt(j)) && (word.charAt(j) == word.charAt(j-1))){

                    }else{
                        temp++;
                    }
                }else{
                    history.put(word.charAt(j), true);
                }
            }
            if(temp > 0){
                series -= 1;
            }
            //단어가 연속인지 아닌지 알수 있음.


        }

        br.close();

        System.out.println(series);
    }

}
