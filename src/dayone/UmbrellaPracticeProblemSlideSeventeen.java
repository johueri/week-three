package dayone;

import java.util.ArrayList;
public class UmbrellaPracticeProblemSlideSeventeen {
	//// https://wecancodeit.github.io/java-slides/objects/arraylists/#/17

		public static void main(String[] args) {
			
			ArrayList<Boolean> conditions = new ArrayList<Boolean>(); // Boolean and anything inside the "<>" are capitalized because they operate as a class(?)
			
			conditions.add(true);
			conditions.add(false);
			conditions.add(false);
			conditions.add(true);
			conditions.add(false);
			
			for(Boolean condition: conditions) {
				if(condition) {
					System.out.println("Better bring an umbrella");
				}else {
					System.out.println("No rain today, enjoy the sun!");
				}
			}

		}

	}


