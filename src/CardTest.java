class Card{
	int number; //instance variable
	String kind;
	static int width = 100; //class variable 
	static int height = 250;
	
	public void print() {
		System.out.println("kind : " + kind + "\t number : " + number);
	}
	public void printSize() {
		System.out.println("width : " + width + "\t height : " + height);
	}
}
public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "space";
		c1.number = 7;
		c1.print();
		c1.printSize();
		
		Card c2 = new Card();
		c2.kind = "diamond";
		c2.number = 10;
		c2.width = 80;
		c2.height = 150;
		c2.print();
		c2.printSize();
		c1.printSize(); // c2가 변해서 c1도 변함 >> class variable
	}

}
