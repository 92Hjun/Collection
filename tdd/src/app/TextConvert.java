package app;

public class TextConvert {
	
	public String upper (String src) {
		if (src == null) {
			return null;
		}
		
		String dest = src.toUpperCase();
		return dest;
	}
}
