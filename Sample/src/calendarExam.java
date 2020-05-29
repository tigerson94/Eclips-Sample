import java.util.Calendar;

public class calendarExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		// ���� �� -1 ���� ���
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);

		// ������ ��¥ (���� 5��)
		int max = c.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= max; i++) {
			// 5���� ������� ���
			System.out.print(" " + (i < 10 ? "0"+i : i));
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
