package multicast;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class BokkParser {
	public static void main(String[] args) throws Exception{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse(new File("src/book.xml"));
		
		String value = doc.getElementsByTagName("title").item(0).getTextContent();
		System.out.println(value);
		String value2 = doc.getElementsByTagName("author").item(0).getTextContent();
		System.out.println(value2);
		String value3 = doc.getElementsByTagName("price").item(0).getTextContent();
		System.out.println(value3);
		
	}
}
