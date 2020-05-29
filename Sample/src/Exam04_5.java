public class Exam04_5 {

	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;
		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			count++; // 던진 횟수 증가
			System.out.printf("(%s, %s)\n", num1, num2);
			// 눈금의 합이 같으면 종료
			if (num1 - num2 == 0) {
				isContinue = false;
			}
		}
		System.out.println("주사위를 던진 횟수 : " + count);
	}
}
