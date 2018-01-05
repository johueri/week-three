package daythree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/objects/maps/#/2

		//first parameter is the key, the second is the value.
		Map<String, String> students = new HashMap<String, String>(); 
		// bracket any questions about "HashMap" for later, but the gist is HashMap is a child of the Map Class. 
		//There are a bunch of different kinds of map types, but we're using HashMap for now.
		//Why are we using "HashMap instead of something else? Assume it's magic for the next two weeks. But you can check out pg. 558 for a diagram
		
		
		students.put("23A52", "Harvey Dent"); // (key, value): 
		// Key's have to be unique. If creates a runtime error if its not; it won't have a syntax error 
		// that is typically highlighted with a red squiggly before running the test.
		// The effor would show up once you run the program. It would just print out the wrong stuff. 
		
		students.put("68Z29", "Jessica Jones");
		students.put("57W85", "J Jonah Jameson");
	
		System.out.println("The students are " + students);
		
		String studentName = students.get(("23A52"));
		System.out.println("Found the student!");
		System.out.println("The student's name is " + studentName);
		
		Set<String> studentIds = students.keySet(); // ??? Had to import java util for this. What does it do?
		System.out.println("The student ID's are " + studentIds);
		
		Collection<String> studentNames = students.values(); // ??? Had to import java util for this. What does it do?
		System.out.println("The student names are " + studentNames);
		
//		for(String id: students.keySet()) {
//			  System.out.println("This student's name is " + students.get(id));
//			}   // THIS IS BAD, even though it appears to do the same thing. See slide 9. 
		
		for(Entry<String, String> entry: students.entrySet()) { //??? Had to import java.util for this. What does it do?
			}
		
	}

}
