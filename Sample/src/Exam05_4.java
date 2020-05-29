public class Exam05_4 {
	public static void main(String[] args) {
		char[] text = { 'g', ' ', 'f', 'm', 'n', 'c', ' ', 'w', 'm', 's', ' ', 'b', 'g', 'b', 'l', 'r', ' ', 'r', 'p',
				'_', 'l', 'q', 'j', '_', 'r', 'c', ' ', 'g', 'r', ' ', '`', 'w', ' ', 'f', '_', 'l', 'b' };
		
	
		
		for(int i = 0; i < text.length; i++) {
		if(text[i] != ' ') {
			char trans = (char) (text[i] + 2);
		
			System.out.print(trans); 
			
		} else {
			System.out.print(text[i]);
		}

	}
 }
}