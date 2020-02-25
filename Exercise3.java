import java.util.*;

public class Exercise3{
	
	public static void main(String args[]){
		
		
		List<String> texts = new ArrayList<>();
		texts.add("Text");
		texts.add("Baseball");
		texts.add("Automation");
		texts.add("Java");
		texts.add("Laptop");
		texts.add(null);
		
		
		A.compareString("Hola","hey"); //calling compareString method from A.
		A.compareString("boo","boo");
		A.checkString("Alai"); //calling CheckString method from A.
		A.checkString("Alameda");
		
		System.out.println("\nUsing functionality from (A) in a new method from (B).");
		B.compareStringInB("Hi","Oli");
		B.checkStringInB("Olalala");
		
		System.out.println("\nprinting method hello from class B using Interface c.\n");
		C objI = new B();
		objI.hello();
		
		B obj = new B();
		obj.orderedList(texts);
 }
}