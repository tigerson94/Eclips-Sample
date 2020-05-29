public class Exam03_4 {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		
		for(int i =1; i <=5; i++) {
			total = total + (num % 10);
			num = num / 10;
		}
//		total = total + num % 10; // 5
//		num = num / 10;
//		
//		total = total + num % 10; // 4
//		num = num / 10;
//		
//		total = total + num % 10; // 3
//		num = num / 10;
//		
//		total = total + num % 10; // 2
//		num = num / 10;
//		
//		total = total + num % 10; // 1
//		num = num / 10;
		System.out.println("각 자리 숫자의 합 : " + total);
	}
}
