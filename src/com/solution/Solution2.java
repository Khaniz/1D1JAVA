package com.solution;

import java.util.Scanner;

public class Solution2 {

    public void no1330() {

        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();
        getInt.close();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }

    public void no9498() {

        Scanner getInt = new Scanner(System.in);
        int a = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 0 & a <= 100) {
                break;
            } else {
                System.out.println("0보다 크거나 같고, 100보다 작거나 같은 정수를 입력하세요");
            }

        }
        getInt.close();

        switch (a / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

    }

    public void no2753() {
        Scanner getInt = new Scanner(System.in);
        int a = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 1 & a <= 4000) {
                break;
            } else {
                System.out.println("1보다 크거나 같고, 4000보다 작거나 같은 자연수를 입력하세요");
            }

        }
        getInt.close();

        if (a % 4 == 0 & (a % 400 == 0 | a % 100 != 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public void no14681() {
        Scanner getInt = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= -1000 & a <= 1000 & a != 0) {
                break;
            } else {
                System.out.println("x는 -1000보다 크고 1000보다 작은 0이 0이 아닌 정수여야합니다.");
            }

        }

        while (true) {
            b = getInt.nextInt();
            if (b >= -1000 & b <= 1000 & b != 0) {
                break;
            } else {
                System.out.println("y는 -1000보다 크고 1000보다 작은 0이 0이 아닌 정수여야합니다.");
            }

        }
        getInt.close();

        if (a > 0) {
            if (b > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }

        } else {
            if (b > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }

    public void no2884() {
        Scanner getInt = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 0 & a <= 23) {
                break;
            } else {
                System.out.println("시는 0시부터 23시까지 숫자만 입력하세요");
            }

        }

        while (true) {
            b = getInt.nextInt();
            if (b >= 0 & b <= 59) {
                break;
            } else {
                System.out.println("분은 0분부터 59분까지 숫자만 입력하세요");
            }

        }
        getInt.close();

        if (b > 45){
            b = b - 45;
            System.out.println(a + " " + b);
        }else {
            int c = 45 - b;
            b = 60 - c;
            a = a -1;
            System.out.println(a + " " + b);
        }
    }
    public void no2525() {
        Scanner getInt = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 0 & a <= 23) {
                break;
            } else {
                System.out.println("시는 0시부터 23시까지 숫자만 입력하세요");
            }

        }

        while (true) {
            b = getInt.nextInt();
            if (b >= 0 & b <= 59) {
                break;
            } else {
                System.out.println("분은 0분부터 59분까지 숫자만 입력하세요");
            }

        }

        while (true) {
            c = getInt.nextInt();
            if (c >= 0 & c <= 1000) {
                break;
            } else {
                System.out.println("요리하는데 필요한 시간은 분 단위 1000까지 입니다");
            }

        }
        getInt.close();

        int pHour = 0;
        int minutes = 0;

        if(b+c >= 60){
            int hours = (b+c)/60;
            minutes = (b+c)%60;

            if(a + hours > 23){
                 pHour = (a + hours) - 24;
            }else {
                pHour = a + hours;
            }
        }
        System.out.println(pHour + " " + minutes);

    }
    public void no2480() {
        Scanner getInt = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        while (true) {
            a = getInt.nextInt();
            if (a >= 1 & a <= 6) {
                break;
            } else {
                System.out.println("주사위의 눈 (1~6)");
            }

        }

        while (true) {
            b = getInt.nextInt();
            if (b >= 1 & b <= 6) {
                break;
            } else {
                System.out.println("주사위의 눈 (1~6)");
            }

        }

        while (true) {
            c = getInt.nextInt();
            if (c >= 1 & c <= 6) {
                break;
            } else {
                System.out.println("주사위의 눈 (1~6)");
            }

        }
        getInt.close();

        if((a+b+c)%a == 0){
            System.out.println(10000+(a*1000));
        }else if(((a==b) | (b==c) | (a==c)) & ((a+b+c)%a != 0)){
            if((a==b) | (a==c)){
                System.out.println(1000+(a*100));
            }else if(b==c){
                System.out.println(1000+(b*100));
            }
        }else {
            if(a>b){
                if(a>c){
                    System.out.println(a*100);
                }else {
                    System.out.println(c*100);
                }
            }else {
                if(b>c){
                    System.out.println(b*100);
                }else {
                    System.out.println(c*100);
                }
            }
        }

    }

}
