
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = 100;
        Integer m = 100;
        int[][] arr = new int[m][n];
        int num = scanner.nextInt();
        for(int i=0;i<num;i++) {
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;
            for(int j=x;j<x+10;j++) {
                for(int k=y;k<y+10;k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int answer = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j] == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
