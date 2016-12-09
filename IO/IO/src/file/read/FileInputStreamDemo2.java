package file.read;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("sample.txt");
		int count = 0;
		byte[] buf = new byte[1024];
		
		/*배열을 사용하여 데이터를 읽어오면 더 빨리 읽어올수있다.(1만배 이상 차이난다.)*/
		/* 텍스트 데이터를 읽어서 담겨있는 배열일때만 사용된다.*/
		
		while ((count=fis.read(buf)) != -1) {
			
			//System.out.println(count);
			String str = new String(buf, 0, count);
			System.out.println(str);
			
		}
		fis.close();
		
		long stop = System.currentTimeMillis();
		System.out.println("소요시간: " + (stop - start) + "밀리초");
	}
}
