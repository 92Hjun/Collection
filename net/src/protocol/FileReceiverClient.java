package protocol;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileReceiverClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.10.96", 22222);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			
			String filename = "Chrysanthemum.jpg";
			// 파일명 보내기
			out.writeUTF(filename);
			
			FileInputStream fis = new FileInputStream("C:/Users/JHTA/Downloads/Chrysanthemum.jpg");
			// 파일 데이터 보내기
			int length = 0;
			byte[] buf = new byte[1024];
			while ((length=fis.read(buf)) != -1) {
				out.write(buf,0,length);
			}
			fis.close();
			socket.close();
			System.out.println("전송이 완료되었습니다.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
