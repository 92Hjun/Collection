package file.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		FileInputStream fis = new FileInputStream("sample.txt");
		
		/*
			int v1 = fis.read();
			int v2 = fis.read();
			int v3 = fis.read();

			System.out.println((char)v1);
			System.out.println((char)v2);
			System.out.println((char)v3);
		*/
		
		long starts = System.currentTimeMillis();
		
		int value = 0;
		/* 파일을 읽어올떄 결과값이 -1 이면 파일의 끝이라는 말이다.*/
		while ((value = fis.read())!= -1) {
		
			System.out.print((char)value);
			
		}
		
		fis.close();
		
		long stop = System.currentTimeMillis();
		
		System.out.println("소요시간:" + (stop-starts)+ "밀리초");
	}
}
