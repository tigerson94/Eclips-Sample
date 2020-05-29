
public class 위치바꾸기 {
	public static void main(String[] args) {

		int[] num = { 3, 2, 1, 7, 4 };
		int min = Integer.MAX_VALUE;
		for(int i=0; i<num.length; i++) {
			int n = num[i];
			if(n<min) {
				min = n;
			}
		}
		System.out.println(min);
		
		
//        int a = 10;
//        int b = 100;
//        System.out.printf("%s %s", a, b);
//        
//        int temp = 0;
//        
//        temp = a;
//        a = b ;
//        b = temp;
//        
//        System.out.printf("%s %s", a, b);
	}
}
