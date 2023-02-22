import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		String sA = String.valueOf(a);
		String sB = String.valueOf(b);

		for(int i = sB.length(); i > 0;i--) {
			int arr = Integer.parseInt(sB.substring(i-1,i));
			System.out.println(a*arr);
		}
		System.out.println(a*b);
	}
}
