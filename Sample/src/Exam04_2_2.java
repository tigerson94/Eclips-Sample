public class Exam04_2_2 {
	public static void main(String[] args) {
		int year = 2010; // ����
		
		if (year % 400 == 0) {
			System.out.println("�����Դϴ�");
		} else if ( year % 100 == 0) {
			System.out.println("����Դϴ�");
		} else if ( year % 4 == 0) {
			System.out.println("�����Դϴ�");
		} else { 
			System.out.println("����Դϴ�");
		}
		  
		/* �ڵ� �ۼ� */
	}
}