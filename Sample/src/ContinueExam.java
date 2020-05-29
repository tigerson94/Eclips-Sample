import java.io.File;

public class ContinueExam {
	public static void main(String[] args) {
		File file = new File("C:\\Windows\\System32\\drivers\\etc");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			long fileSize = files[i].length();
			if (fileSize < 100) { // 파일크기가 100Byte 미만이면 아래 코드 무시
				continue;
			}
			System.out.println(files[i].getName() + " / " + fileSize);
		}
	}
}