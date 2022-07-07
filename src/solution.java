import java.util.Scanner;

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

}
