import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String t = "";
        while(sc.hasNext()) {
            t = sc.nextLine().replaceAll(" ","");

            if(t.length() == 4) {
                if(t.replaceAll("0","").length() == 4) {
                    System.out.println("E");
                }else if(t.replaceAll("0","").length() == 3) {
                    System.out.println("A");
                }else if(t.replaceAll("0","").length() == 2) {
                    System.out.println("B");
                }else if(t.replaceAll("0","").length() == 1) {
                    System.out.println("C");
                }else if(t.replaceAll("0","").length() == 0) {
                    System.out.println("D");
                }
            }
        }
    }
}