package simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) throws Exception{
		// 192.168.10.101 ip주소에 있는 55555포트번호를 가진 프로그램에 연결을 요청합니다
		Socket socket = new Socket("192.168.10.101", 55555);
		
		// 서버로 메세지를 보내는 스트림 얻기
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		// 서버가 보낸 메세지를 읽는 스트립 얻기
		BufferedReader br = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
		
		
		// 서버로 메세지 보내기
		pw.println("장해영");
		
		// 서버가 보낸 메세지 읽기
		String message = br.readLine();
		System.out.println("메세지:" + message);
		
		socket.close();
		
		
	}
}
