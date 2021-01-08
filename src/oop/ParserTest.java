package oop;

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("documnent.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}

}
interface Parseable{
	public abstract void parse(String fileName);
}
class ParserManager{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}
		else {
			return new HTMLParser();
		}
	}
}
class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "-XNL parsing completed");
	}
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + "-HTML parsing completed");
	}
}















