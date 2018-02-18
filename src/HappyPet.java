import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog(null,"What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
int happy = 0;
 for (int i = 0; i < 5; i++) {
	

int task = JOptionPane.showOptionDialog(null, "What do you want to do to your pet to make them happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed it", "Water it like a plant", "force fart it" }, null);
if (task==0) {
	FeedPet(pet);
	happy+=1;
}
if (task==1) {
	WaterPet(pet);
	happy+=2;
}
if (task==2) {
	FartPet(pet);
happy+=10;
}
if (happy>=15) {
	JOptionPane.showMessageDialog(null, "Your pet loves you!");
	System.exit(0);
}
 }
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	public static void FeedPet(String pet) {
		
		JOptionPane.showMessageDialog(null, "Your "+ pet +" eats the food");
	}

	public static void WaterPet(String pet) {
		
		JOptionPane.showMessageDialog(null, "Your "+ pet +" got watered");
	}

	public static void FartPet(String pet) {
		
		JOptionPane.showMessageDialog(null, "Your "+ pet +" farted");
	}
	
	}
