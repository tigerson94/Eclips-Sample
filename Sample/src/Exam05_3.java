public class Exam05_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length; i++) {
			int ran = (int) (Math.random() * nums.length);
			char temp = ' ';
			temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}
		System.out.println(nums);

	}
	
}