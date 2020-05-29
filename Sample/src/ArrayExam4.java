public class ArrayExam4 {
	public static void main(String[] args) {
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };

		for(int i = 0; i < 10000; i++) {
			int a = chars[0];
			int ran = (int) (Math.random() * chars.length);
			int b = chars[ran];
			int temp = a;
			a = b;
			b = temp;
			chars[0] = (char) a;
			chars[ran] = (char) b;
			System.out.println(chars);
		}
		
		

		
		
		
		
		
//		String sep = "";
//		char temp = ' ';
//		for (int i = 0; i < chars.length - 1; i++) {
//			for (int j = i + 1; j < chars.length; j++) {
//				if (chars[i] > chars[j]) {
//					temp = chars[i];
//					chars[i] = chars[j];
//					chars[j] = temp;
//				}
//			}
//		}
//		System.out.println(sep + chars);
//		sep = ", ";
	}
}