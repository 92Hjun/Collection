package file.character;

public class FileWriter {
	

	
	public static void main(String[] args) throws Exception{
		
		java.io.FileWriter writer = new java.io.FileWriter("song.txt");
		
		writer.write("걣교종이 땡땡떙 어서모이자 선생님이 우리를 기다리신다.");
		
		writer.flush();
		
		writer.close();
	}
}
