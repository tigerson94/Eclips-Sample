public class Exam05_2 {
	
	public static void main(String[] args) {
		int[] arr = { 10, 0, 12, 0, 14, 0, 16, 0, 18, 0 };
        
		int total = 0;
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			
			total += arr[i];
			if(arr[i] == 0 ) {
				continue;
			}
			else {
				a++;
			}
		}
		System.out.println("�� :" + total);
		System.out.println("������ :" + total / (double)a);
	}
}
