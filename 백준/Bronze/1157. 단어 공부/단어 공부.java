import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        int[] arr = new int[26];
        
        for(int i=0;i<str.length();i++) {
            arr[str.charAt(i) - 'A']++;
        }
        
        int max = -1;
        int idx = -1;
        int[] counts = new int[100000];
        for(int i=0; i < 26; i++) {
            if(arr[i] > 0 ) {
                counts[arr[i]]++;
                if(arr[i] > max) {
                    max = arr[i];
                    idx = i + 'A';
                }
            }
        }
        if(counts[max] > 1) System.out.println("?");
        else System.out.println((char) idx);
        
    }
}