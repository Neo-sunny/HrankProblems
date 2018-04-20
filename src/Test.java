import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test {
public static void main(String[] args) {
	int n= 1000;
	//int[] a = new int[n*n*n*n];
	
	String stmt = "Have a nice day";
	for(String str: stmt.split("//s")){
		System.out.println(str+ "--");
		
		Integer intvar1 = new Integer(25);
		IdentityHashMap<Integer, String> emp2 = new IdentityHashMap<>();
		HashMap<Integer, String> emp1  = new HashMap<>();
		emp1.put(intvar1, "Denis");
		emp2.put(intvar1, "Debbie");
		System.out.println(emp1);
		System.out.println(emp2);
		
	}
}
}
/*
 * 
 * the _____ class is an uninstantiable placeholder class to hold a reference 
 *  to the class object representing the primitive Java type void.
 * 
 * */
 