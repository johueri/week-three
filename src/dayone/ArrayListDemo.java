package dayone;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/objects/arraylists/#/3

		ArrayList<String> giantWords = new ArrayList<String>(); // "giantWords" is the name of the array.
		// You should always name your connections plural. The "String inside of the
		// "<>" means its an array list of Strings.
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements"); // the "size" tells the size of the length

		giantWords.add("fum");

//		for (int i = 0; i < giantWords.size(); i++) {
//			System.out.println(giantWords.get(i) + ",");
//		}  //This code does the same thing as the code below
		//ehanced for loop (for each loop)
		for (String giantWord : giantWords) {
			System.out.println(giantWord + ", ");
		}
		
		ArrayList<Integer> answers = new ArrayList <Integer>();
		answers.add(1);
		System.out.println("\nAre you out of answers? " + answers.isEmpty());
	}
}
