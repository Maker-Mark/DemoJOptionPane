import javax.swing.JOptionPane;

public class DemoJOptionPaneMain {
	public static void main(String[] args) throws Exception{

		System.out.println("lets see how JOptionPane works");

		JOptionPane.showMessageDialog(null, "There are three different kinds of dialog boxes:");

		JOptionPane.showMessageDialog(null, "One where you can show a message and an OK button will be delayed.");
		
		String test1 = JOptionPane.showInputDialog(null, "Another where you can get input from your user. "
				+ "Note it will always be turned into a string. Enter your Account balance ;] :");
		
		String test2 = 	JOptionPane.showInputDialog("Enter Amount to Deposit ");
		
		System.out.println("the string test1 is now: " + test1 + "the STRING test2 is now: " + test2);
		System.out.println(test1 + test2);
		
		int myNum , urNum, sum;
		
		myNum = Integer.parseInt(test1);
		urNum = Integer.parseInt(test2);
		sum = myNum + urNum;
		System.out.println("Bal: " + sum);
		

		JOptionPane.showConfirmDialog(null, "The message always follows");
		
		//The JOptionPane Class also allows its methods to be overloaded. This can be seen in the method below.
		//Video @ https://www.youtube.com/watch?v=WfkZQHffxqE&t=12s
		JOptionPane.showMessageDialog(null, "Here is the message", "then comes the title", JOptionPane.NO_OPTION);

	}

}
