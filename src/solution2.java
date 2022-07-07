import java.util.Scanner;

public class solution2 {

    public void no1330(){

        Scanner getInt = new Scanner(System.in);

        int a = getInt.nextInt();
        int b = getInt.nextInt();
        getInt.close();

        if(a>b){
            System.out.println(">");
        }else if (a<b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }

    }
}
