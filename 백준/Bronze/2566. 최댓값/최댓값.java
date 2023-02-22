
import java.util.Scanner;

public class Main {
    public void solution(int num, int num2, int[][] arr) {
        int max = -1;
        int x = -1,y = -1;

        for(int i=0;i<num2;i++) {
            for(int j=0;j<num;j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    x = (i+1);
                    y = (j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = 9; //4
        Integer m = 9; //3
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Main test = new Main();

        test.solution(n,m,arr);
    }
}
