package sec02.exam01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int row = 10;
		int remain = row % 2; // Ȧ ¦ ����
		boolean odd = remain > 0;
		
		System.out.println(odd);
		
		char result = odd == true ? 'Ȧ' : '¦';
		String result2 = odd == true ? "Ȧ��" : "¦��";
		
		System.out.printf("%s %s", result, result2);
	}
}