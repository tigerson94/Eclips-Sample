import java.util.Scanner;

public class Exam03_3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		boolean result = (n%11 == 0);
		boolean result2 = (n%11 != 0);
		System.out.println(result);
	}
}
