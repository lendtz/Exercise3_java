import java.util.*;

public class B extends A implements C{
		
	
	
	public static void compareStringInB(String a,String b){
		A.compareString(a,b);
	}
	
	public static void checkStringInB(String a){
		B.checkString(a);
	}
	
    //this is an override method.
	public void hello(){
		System.out.print("hello Interface");
	}
	
	public void orderedList(List<String> texts){
	Collections.sort(texts,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
	System.out.println("\nPrinting in Asc order\n");
	for(int i =0; i<texts.size();i++){
		System.out.println(texts.get(i));
	}
	
	Collections.reverse(texts);
	System.out.println("\nPrinting in Desc Order\n");
		for(int i =0; i<texts.size();i++){
		System.out.println(texts.get(i));
	}
	}
	
	public void removeNull(List<String> texts){
		
	}
}