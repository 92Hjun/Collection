package file.second;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo1 {
	public static void main(String[] args) throws Exception {
			
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		/*
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		*/
		
		String text = null;
		
		while ( (text=br.readLine()) != null) {
			
			String[] text2 = text.split(",");
			String name = text2[0];
			int kor = Integer.parseInt(text2[1]);
			int eng = Integer.parseInt(text2[2]);
			int math = Integer.parseInt(text2[3]);
			
			int total = kor+ eng + math;
			int avg = total/3;
			
			System.out.printf(" %s %d %d %d %d %d\n", name, kor, eng, math, total, avg);
			
		}
		br.close();
		
		
	}
}
