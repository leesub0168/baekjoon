import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
