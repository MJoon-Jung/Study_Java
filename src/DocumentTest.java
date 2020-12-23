class Document{
	static int count = 0;
	String title;
//	Document(){
//		title = "제목없음" + ++count;
//	}
//	Document(String title){
//		this.title = title;
//	}
//	public void printTitle() {
//		System.out.println("title : " + title);
//	}
	Document(){
		this("제목없음" + ++count);
	}
	Document(String title){
		this.title= title;
		System.out.println("title : " + title+" 이 생성되었습니다");
	}
	
}
public class DocumentTest {

	public static void main(String[] args) {
		
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document();
		Document d4 = new Document();
		Document c1 = new Document("Game");
		Document c2 = new Document("Program");
//		
//		d1.printTitle();
//		d2.printTitle();
//		d3.printTitle();
//		d4.printTitle();
//		
//		c1.printTitle();
//		c2.printTitle();

	}

}
