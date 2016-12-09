package file.second;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		
		String resource = "C:\\Users\\JHTA\\Downloads\\D2Coding-1.2.zip";
		/*
		long begin1 = System.currentTimeMillis();
		FileInputStream fis1 = new FileInputStream(resource);
		
		while (fis1.read() != -1) {}
			fis1.close();
		
		long end1 = System.currentTimeMillis();
		System.out.println("소요시간: " + (end1 - begin1) + "밀리초");
			6000 밀리초
		*/
		
		long begin2 = System.currentTimeMillis();
		
		//FileInputStream fis2 = new FileInputStream(resource); // 1차스트림
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resource)); // 2차 스트림
		
		while (bis.read() != -1) {
			
		}
		long end2 = System.currentTimeMillis();
		
		System.out.println("소요시간:" +(end2 - begin2)+ "밀리초");
		// 109 밀리초
		bis.close();
	}
	
}
