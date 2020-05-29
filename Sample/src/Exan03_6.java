import java.io.IOException;
import java.util.Scanner;

public class Exan03_6 {
	public static void main(String[] args) throws IOException {
		Scanner s= new Scanner(System.in);
		String in = s.nextLine();
//		char ch = in.charAt(0);
		
		int input = System.in.read();
		System.out.println(input);
		char ch = (char)input;
		
		
		char a = 'T';
		
		char result =
				a >= 'A' && a <= 'Z' ? 
				(char)(a + 2) : 
				a;
		System.out.println(result);
	}
}
