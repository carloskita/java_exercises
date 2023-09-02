import javax.swing.JOptionPane;

public class GuiTutorial {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		//Convert JOptionPane to integer
		int age = Integer.parseInt(
				JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Enter your height (meters):"));
		JOptionPane.showMessageDialog(null, "Your are " + height + "m tall");
	}
}
