package object_class;

public class ClassEx {
	//Ŭ������? ���赵, �����Ϳ� �Լ��� ����, ����� ���� Ÿ��

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
		
		System.out.println("c1�� "+c1.kind+", "+c1.number+"�̸� ũ��� ("+Card.width+","+Card.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.number+"�̸� ũ��� ("+Card.width+","+Card.height+")");
		System.out.println("c1�� width�� height�� ���� 50,80���� �����մϴ�.");
		c1.width = 50;
		c1.height=80;
		
		System.out.println("c1�� "+c1.kind +"," +c1.number+"�̸�, ũ���  ("+Card.width+","+Card.height+")");

	}

}

class Card {
	static int width = 100;
	static int height = 200;
	String kind;
	int number;
}
