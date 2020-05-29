package sec02.exam01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int row = 10;
		int remain = row % 2; // È¦ Â¦ ±¸ºÐ
		boolean odd = remain > 0;
		
		System.out.println(odd);
		
		char result = odd == true ? 'È¦' : 'Â¦';
		String result2 = odd == true ? "È¦¼ö" : "Â¦¼ö";
		
		System.out.printf("%s %s", result, result2);
	}
}