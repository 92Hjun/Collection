package file.read;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws Exception {
		
		// FileOutputStream은 파일이 존재하지 않아도 상관없다.
		// 파일이 존재하지 않으면 파일을 새로 생성해서 내용을 기록한다.
		FileOutputStream fns = new FileOutputStream("sample3.txt");
		
		FileInputStream fis = new FileInputStream("sample3.txt");
		
		int count = 0;
		
		String text = "FileOutputStream은 파일이 존재하지 않아도 상관없다.";
		
		byte[] bytes = text.getBytes();
		fns.write(bytes);
		
		byte[] byte1 = new byte[1024];
		
		while ((count=fis.read(byte1)) != -1) {
			
			String str = new String(byte1, 0, count);
			System.out.println(str);
		}
		
		
			
		fns.close();
		fis.close();
		
		
	}
}
