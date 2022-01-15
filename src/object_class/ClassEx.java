package object_class;

public class ClassEx {
	//클래스란? 설계도, 데이터와 함수의 결합, 사용자 정의 타입

	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		Card c3 = new Card();
		c3.kind = "Diamond";
		c3.number = 11;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c2는 "+c2.kind+", "+c2.number+"이며 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		c1.width = 50;
		c1.height=80;
		
		System.out.println("c1은 "+c1.kind +"," +c1.number+"이며, 크기는  ("+Card.width+","+Card.height+")");

	}

}

class Card {
	static int width = 100;
	static int height = 200;
	String kind;
	int number;
}
