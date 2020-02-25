public class A{
	public static void compareString(String a,String b){
		if(a.equals(b)){
			System.out.println("\nString a :"+a+"\nString b :"+b+ "\nThey are the same.\n");
		}else{
			System.out.println("\nString a :"+a+"\nString b :"+b+ "\nThey are not the same.\n");
		}
	}
	
	public static void checkString(String a){
		if(a.length() > 4){
			System.out.println("String entered :"+a);
		}else{
			System.out.println("String entered isn't greater than 4.");
			char e[] = a.toCharArray();
			for(int i=0;i < e.length;i++){
				System.out.println(e[i]);
			}
			System.out.println();
			}
	}
	}
	