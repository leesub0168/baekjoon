import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int[] arr2 = new int[7];
        for(int i=0;i<9;i++) {
            arr[i] = sc.nextInt();
        }

        int idx = 0, total = 0;
        for(int i=0;i<9;i++) {
            for(int j=i+1;j<9;j++) {
                idx = 0;
                total = 0;
                for(int x=0;x<9;x++) {
                    if(x != i && x != j) {
                        arr2[idx] = arr[x];
                        idx++;
                    }
                }

                for(int y=0;y<7;y++) {
                    total += arr2[y];
                }
                if(total == 100) break;

            }
            if(total == 100) break;
        }

        Arrays.sort(arr2);

        for(int i=0;i<7;i++) {
            System.out.println(arr2[i]);
        }
        
    }
}