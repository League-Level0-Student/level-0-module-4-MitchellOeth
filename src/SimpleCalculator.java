

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String integer1 = JOptionPane.showInputDialog(null, "Give me an integer");
String integer2 = JOptionPane.showInputDialog(null, "Give me another integer");
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
		if (operation==0) {
		add(integer1, integer2);	
		}
		else if (operation==1) {
			subtract(integer1, integer2);
		}
		else if (operation==2) {
			multiply(integer1, integer2);
		}
		else if (operation==3) {
			divide(integer1, integer2);
		}
	// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
	}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations


	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

static void add(String integer1,String integer2) {
	int i = Integer.parseInt(integer1);
	int o = Integer.parseInt(integer2);
int add = i + o;
	JOptionPane.showMessageDialog(null, i + "+" + o + "=" + add);
}
static void subtract(String integer1,String integer2) {
	int i = Integer.parseInt(integer1);
	int o = Integer.parseInt(integer2);
int sub = i - o;
	JOptionPane.showMessageDialog(null, i + "-" + o + "=" + sub);
}
static void multiply(String integer1,String integer2) {
	int i = Integer.parseInt(integer1);
	int o = Integer.parseInt(integer2);
int sub = i * o;
	JOptionPane.showMessageDialog(null, i + "x" + o + "=" + sub);
}
static void divide(String integer1,String integer2) {
double i = Integer.parseInt(integer1);
double o = Integer.parseInt(integer2);
double sub = i / o;
	JOptionPane.showMessageDialog(null, i + "/" + o + "=" + sub);
}
	// 4. Create similar methods for subtraction, multiplication and division.
}
