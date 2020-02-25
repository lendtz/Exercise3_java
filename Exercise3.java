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
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		
		
		
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
		
		obj.removeNull(texts);
		
		obj.givenMissingNumber(numbers);
 }
}