package StringsMethods;

public class Strings {

	public static void main(String[] args) {

		System.out.println("ALL STRINGS");
		// Find length of string
		String name = "Dashrath";
		int length = name.length();
		System.out.println("String length: " + length);
		// Upper case of string
		String uppercase = name.toUpperCase();
		System.out.println("Uper case:" + uppercase);
		// lower case of string
		String lowercase = name.toLowerCase();
		System.out.println("Lower case:"+lowercase);
		// String charAt
		char ch = name.charAt(2);
		System.out.println("String CharAt:"+ch);
	    //String compareTo
		String name1 = "Ram";
		System.out.println("String compareTo:"+name.compareTo(name1));
	    //String concat
		String name2 = "love";
		String allname = name. concat(name1). concat(name2);
		System.out.println("String concat:" +allname);
		//String contains
		System.out.println("String contains:" + name.contains("sh"));
		//String endsWith
		System.out.println("String endsWith:"+name.endsWith("h"));
		//String equals
		System.out.println("String equals:"+name.equals(name1));
		//String equalsIgnoreCase
		System.out.println("String equalsIgnoreCase:"+name.equalsIgnoreCase(allname));
		//String format
		String number1 = String.format("My Name is %s",name);
		System.out.println("String format:"+number1);
		//String getBytes
		//String getChars
		//String indexOf
		int number2 = name.indexOf("sh");
		System.out.println("String indexOf:"+ number2);
		//String intern
		
	}

}
