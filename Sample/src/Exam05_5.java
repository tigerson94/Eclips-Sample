import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {

		boolean isRun = true;

		int studentNum = 0;

		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		while (isRun) {
			System.out.println("======================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("======================================");
			System.out.print("���� > ");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				System.out.print("�л��� �Է� >");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = scan.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int total = 0;
				int a = 0;
				for (int i = 0; i < scores.length; i++) {
					max = max < scores[i] ? scores[i] : max;
					total += scores[i];
					a = total / studentNum;
				}
				System.out.println("�ְ� ���� :" + max);
				System.out.println("��� ���� :" + (double)a);

			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		System.out.println("���α׷� ����");
		scan.close();
	}
}