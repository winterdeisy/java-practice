package object_class;

public class MethodEx {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiple(5L, 3L);
		double result4 = mm.divide(5.0, 3.0);
		
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
	double divide (double a, double b) {
		double result = a / b;
		return result;
	}
	
	//두 값을 받아서 둘 중 큰 값을 반환하는 메소드
	long max(long a, long b) {
		if(a>b) {
			return a;
		} else return b;
	}
}