import java.util.Scanner;

public class TestJava {
	public static void main(String[] args) {
		int 기본1 = 10;
		int 기본2 = 10;

		Scanner 참조1 = new Scanner(System.in);
		Scanner 참조2 = new Scanner(System.in);
		Scanner 참조3;

		System.out.println(기본1 == 기본2);
		System.out.println(참조1 == 참조2);
	}
}
