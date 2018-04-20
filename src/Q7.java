
public class Q7 {

	static Object testObj;
	
	static String meth(){
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println((Q7.meth()).equals(Q7.testObj));
	}
}
