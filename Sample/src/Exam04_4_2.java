public class Exam04_4_2 {
	
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				total += i;
				System.out.println(i);
			}
		}
		System.out.println(total);

	}
}