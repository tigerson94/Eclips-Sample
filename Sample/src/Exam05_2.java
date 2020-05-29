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
		System.out.println("합 :" + total);
		System.out.println("나머지 :" + total / (double)a);
	}
}
