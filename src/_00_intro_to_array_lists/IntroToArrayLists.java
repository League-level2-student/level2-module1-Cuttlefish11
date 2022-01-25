package _00_intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JButton;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> texts = new ArrayList<String>();
		texts.add("a");
		texts.add("b");
		texts.add("c");
		texts.add("d");
		texts.add("e");
		texts.add("f");
		texts.add("g");
		texts.add("h");
		//2. Add five Strings to your list
for (int i = 0; i < texts.size(); i++) {
	String s = texts.get(i);
	System.out.println(s);
}
for (String numberOf: texts) {
	System.out.println(numberOf);
}
for (int i = 0; i < texts.size(); i++) {
	String s = texts.get(i);	
if(i%2 == 0) {
	System.out.println(s);
}
}

		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
for (int i = texts.size()-1; i >=0; i--) {
	String s = texts.get(i);
	System.out.println(s);
}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
for (int i = 0; i < texts.size(); i++) {
	String s = texts.get(i);
if(s.contains("e")) {
	System.out.println(s);
}
}
	}
}
