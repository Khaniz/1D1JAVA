import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class solution {

    public void dog(){

        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

    }

    public void subs2(){

        Scanner getInt = new Scanner(System.in);
        int a = getInt.nextInt();
        while(0 >= a){
            System.out.println("첫 입력은 0보다 커야합니다");
            a = getInt.nextInt();
        }

        int b = getInt.nextInt();
        while(b >= 10){
            System.out.println("마지막 입력은 10보다 작아야합니다");
            b = getInt.nextInt();
        }

        System.out.println(a-b);
    }

    public void substractionThreeTwo(){

        Scanner getInt = new Scanner(System.in);
        int a = getInt.nextInt();

        int b = getInt.nextInt();

        System.out.println(a-b);
    }

    public void no10998(){

        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();

        getInt.close();

        System.out.println(a*b);

    }

    public void no1008(){
        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();

        getInt.close();

        System.out.println((double)a/b);

    }

    public void no10869(){

        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();

        getInt.close();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    public void no10926(){

        Scanner getStringLine = new Scanner(System.in);

        String id = getStringLine.nextLine();
        getStringLine.close();

        System.out.println(id+ "??!");
    }

    public void no18108(){

        Scanner getInt = new Scanner(System.in);

        int time = getInt.nextInt();

        while(true){
            if(time <= 1000 || time >= 3000){
                System.out.println("1000~3000 사이의 연도를 입력해주세요");
                time = getInt.nextInt();
            }else {
                break;
            }
        }
        getInt.close();

        int ac = time-543;
        System.out.println(ac);

    }

    public void no10430(){

        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();
        int c = getInt.nextInt();

        getInt.close();

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }

    public void no2588(){
        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();
        getInt.close();

        String strB = Integer.toString(b);
        String first = strB.substring(2,3);
        String second = strB.substring(1,2);
        String third = strB.substring(0,1);

        System.out.println(a*parseInt(first));
        System.out.println(a*parseInt(second));
        System.out.println(a*parseInt(third));
        System.out.println(a*b);

    }

    public void no25083(){
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");

    }

}
