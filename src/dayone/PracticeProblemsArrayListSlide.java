package dayone;

import java.util.ArrayList;

public class PracticeProblemsArrayListSlide {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/objects/arraylists/#/17
		
		ArrayList<String> animals  = new ArrayList<String>(); // whatever goes where string is, including boolean, should be capitalized because they operate as a class(?)
		
		animals.add("lions");
		animals.add("tigers");
		animals.add("bears");
		animals.add("sea turtles");
		animals.add("falcons");
		
		// enahanced for loop
		for (String animal : animals) {
			System.out.println(animal);
		

	}
	


}
}
