import java.util.Arrays;

public class �ζ��ϵ���߱� {
	public static void main(String[] args) {
		int[] lotto = { 5, 8, 18, 21, 22, 38 };
		int count = 0;
		// �ζ� ����
		while (true) {
			int[] my = new int[6];

			// �ζǹ�ȣ 6�� (1�屸��)
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			// ���� (�������� 1,2,3....)
			Arrays.parallelSort(my);

			// ���� ����
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("Ƚ�� :" + count);

			// ��ȣ ��
			boolean result = Arrays.equals(lotto, my);
			if (result) { // 1�� ��÷!
				System.out.println(Arrays.toString(my));
				break;
			}
		}
	}
}
