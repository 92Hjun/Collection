package sample1;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class FileReceiverThread extends Thread{
	private Socket socket = null;
	
	public FileReceiverThread (Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		// 파일 수신처리하기
		try {
			DataInputStream in = new DataInputStream(socket.getInputStream());
			
			// 파일 이름 읽어오기
			String filename = System.currentTimeMillis() + in.readUTF();
			
			// 파일 사이즈 읽어오기
			long size = in.readLong();
			
			// 파일 데이터를 파일로 저장하기
			FileOutputStream fos = new FileOutputStream("C:/project/temp/" + filename);
			long readSize =0;
			int len = 0;
			byte[] buf = new byte[1024];
			
			while ((len=in.read(buf))!= -1) {
				fos.write(buf, 0 , len);
				readSize += len;
				
				System.out.println((readSize/(double)size) * 100 + "% 완료");
			}
			fos.close();
			System.out.println("["+filename+"] 저장완료");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
