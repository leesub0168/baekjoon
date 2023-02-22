
import java.util.Scanner;

public class Main {
    public int[][] solution(int num, int num2, int[][] arr, int[][] arr2) {
        int[][] answer = new int[num2][num];
        for(int i=0;i<num2;i++) {
            for(int j=0;j<num;j++) {
                answer[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for(int i=0;i<num2;i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(answer[i][j]);
                if(j < num-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt(); //4
        Integer m = scanner.nextInt(); //3
        int[][] arr = new int[m][n];
        int[][] arr2 = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        Main test = new Main();

        test.solution(n,m,arr,arr2);
    }
}