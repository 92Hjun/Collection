package simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args)throws Exception {
		
		// ServerSoket 만들기
		ServerSocket server = new ServerSocket(55555);
		System.out.println("서버가 구동 되었습니다.");
		
		// Accept()는 클라이언트의 연결 요청이 올때까지 대기한다.
		// Accept()는 클라이언트의 연결 요청이 오면 실행된다.
		// Accept()는 클라이언트의 연결 요청이 오면 그 클라이언트와 통신할 Socket을 생성한다.
		Socket socket = server.accept();
		
		BufferedReader br = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
		
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		
		String message = br.readLine();
		System.out.println("메세지" + message);
		
		pw.println(message+ "님 환영합니다.");
		
		socket.close();
		System.out.println("클라이언트와 연결 되었습니다.");
		
		server.close();
		
	}
}
