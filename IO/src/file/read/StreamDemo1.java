package file.read;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class StreamDemo1 {
	public static void main(String[] args) throws Exception {

		/*
		 URL url = new URL("http://edition.cnn.com");
		  
		 InputStream is = url.openStream();
		  
		 int count = 0 ; byte[] buf = new byte[1024]; while ( (count =
		 is.read(buf)) != -1) {
		 
		 String str = new String(buf, 0, count); System.out.println(str);
		 
		 }
		 */

		URL url = new URL("http://i2.cdn.cnn.com/cnnnext/dam/assets/161208094358-yangyonglianghp8-exlarge-169.jpg");

		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("a.jpg");

		int count = 0;

		byte[] buf = new byte[1024 * 8];

		while ((count = is.read(buf)) != -1) {

			fos.write(buf, 0, count);

		}
		fos.close();
	}
}
