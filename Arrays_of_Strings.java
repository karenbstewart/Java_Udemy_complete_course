package programming.core.java;

public class Arrays_of_Strings {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello ";
		words[1] = "to ";
		words[2] = "you ";
		
		String[] fruits = {"apple ", "banana ", "pear ", "kiwi "};
		System.out.println(words[0] + fruits[1]);
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		
		int value = 0;
		
		// Allocates enough memory for a reference to a string
		// String is a Class not a primative datatype 
		String text = null;
		
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println(texts[0]);
		
		texts[0] = "one";
		
		

	}

}
