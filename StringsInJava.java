package javaLearning;

public class StringsInJava {
	
	  /* Strings in Java are immutable 
	 * Strings in Java is a class that implements charSequence Interface
	 * Strings can be created using 
	 * 1.String Literal --> String name ="Mythili";
	 * 2. Using new keyword --> String s =new String("Mythili");
	 * Memory allocation is less for string literal and more for new keyword
	 * if a string is repeated literal will not allocate space again but each time 
	 * new keyword is encountered it will allocate space in memory
	 * Charsequence is implemented by 3 classes --> String,StringBuffer,StringBuilder  */
	
	static String name = "Mythili";
	static String Husbandname = "Raman";
	static String namespace = " Mythili  ";
	static int number2 = 8;

	public static void main(String[] args) {

		//every count starts from 0
		// returns the char value at particular index
		System.out.println(name.charAt(0));

		//Returns the length
		System.out.println(name.length());

		//checks exact equality 
		System.out.println(name.equals("mythili"));

		//checks exact equality irrespective of case
		System.out.println(name.equalsIgnoreCase("mythili"));

		//checks exact equality 
		System.out.println(name.isEmpty());
		
		//check for specific char or set of chars to exist
		System.out.println(name.contains("M"));
		
		//contents 
		System.out.println(name.contentEquals("Mythili"));
		
		// substring -returns the portion of string
		System.out.println(name.substring(1));
		System.out.println(name.substring(1,6)); //does not include end index
		//substring is an example of method overloading
		
		System.out.println(name.concat(Husbandname));
		
	   //Removes whitespace from both the ends
		System.out.println(namespace.trim());
		
		//replaces all occurrences of a character to another character
		String date = "23-05-2024";
		System.out.println(date.replace("-", "/"));
		//learn what are the multiple methods in replace
		//replaces all occurence in a string with a particular letter
		String name2 = "Chathush weight";
		System.out.println(name2.replace("h", "b"));
		
		
	    String result = String.valueOf(number2);
	    System.out.println(result);
	    
	    String lowerCase = "sreemathi";
	    System.out.println(lowerCase.toUpperCase());
	    
	    String upperCase = "SREEMATHI";
	    System.out.println(upperCase.toLowerCase());
		
	    System.out.println(name.indexOf("i"));
	    System.out.println(name.indexOf("i",5));
	    System.out.println(name.indexOf('h',2));

	      //Returns a joined string with the given delimiter
	    System.out.println(String.join("_","Srimathe","Ramanujaya","Namaha"));
	    System.out.println(String.join("-" ,"23","05","2024"));
	    
	    
	    //Spilt 
	    String message = "Maam ekam charanam vraja";
	    String[]finalMessage= message.split(" ");
	    for (String finish:finalMessage) {
	    	System.out.println(finish);
	    }
	   
	    // StringBuffer and String Builder are the part of charSequence
	    
		
		
		
		
		
		
		
		
		
		
				
	    
		

	}

}
