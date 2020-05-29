public class Exam04_6 {
	public static void main(String[] args) {
//		int space = 0;
//		for(int row = 1; row <= 5; row ++) {
//			space = row - 1;
//			for(int col = 1; col <= 5; col++)
//				if(space >= col) {
//				    System.out.println(" ");
//				} else {
//					System.out.print("@");
//				}
//		System.out.println();
//		}
//		
//	}	
		int space = 0;
		for(int row = 1; row <= 5; row ++) {
			space = 5 - row;
			for(int col = 1; col <= 5; col++)
				if(space >= col) {
				    System.out.print(" ");
				} else {
					System.out.print("@");
				}
			System.out.println();
		}
	}
}
