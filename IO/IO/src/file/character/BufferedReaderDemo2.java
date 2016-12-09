package file.character;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class BufferedReaderDemo2 {
	public static void main(String[] args) throws Exception{
		
		String path = "http://192.168.10.101:8080/data.jsp";
		
		URL url = new URL(path);
		
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(url.openStream()));
		
		String str = null;
		
		while ((str = br.readLine()) != null) {
			
			System.out.println(str);
			
		}
			
			
		br.close();
		
	}
}
