package sec02.exam01;

public class SignOperatorExample2 {
	public static void main(String[] args) {
		char alph = 'T';
		
		char result =
				alph >= 'T' && alph <= 't' ? 
				(char)(alph + 32) : 
				alph;
		System.out.println(result);
	}
}
