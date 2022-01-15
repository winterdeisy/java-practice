package object_class;

public class MethodEx {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiple(5L, 3L);
		long result4 = mm.divide(5L, 3L);
		
		System.out.println("add: "+result1);
		System.out.println("subtract: "+result2);
		System.out.println("multiple: "+result3);
		System.out.println("divide: "+ result4);

	}

}

class MyMath {
	long add (long a, long b) {
		long result = a + b;
		return result;
	}
	long subtract (long a, long b) {
		long result = a - b;
		return result;
	}
	long multiple (long a, long b) {
		long result = a * b;
		return result;
	}
	long divide (long a, long b) {
		long result = a / b;
		return result;
	}
}