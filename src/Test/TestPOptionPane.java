package Test;


import javax.swing.*;

public class TestPOptionPane {
	
	public static void main ( String [] args) {
		
		
/*// Componente padre + Mensaje dentro + Mensaje en barra + poner el mensaje en barra
		
		JOptionPane.showInputDialog(null,"Convertidor de la moneda Argentina","Buenas tardes",JOptionPane.INFORMATION_MESSAGE);
		
		// Componente padre + Mensaje dentro + mensaje por defecto y no en la barra
		JOptionPane.showInputDialog(null,"Convertidor de la moneda Argentina","Buenas tardes");
		
		
		// Componente padre + Mensaje dentro
		JOptionPane.showInputDialog(null,"Convertidor de la moneda Argentina");
		
		*/
		
		
		
		JFrame frame = new JFrame("JoptionPane Test");
	      frame.setSize(200, 200);
	      //frame.setLocationRelativeTo(null);
	    

	      JOptionPane.showMessageDialog(frame, "Hola mundo!");
	      JOptionPane.showConfirmDialog(frame, "Esto es de confirmación");
	      JOptionPane.showInputDialog(frame, "Ingresar un numero");
	      //JOptionPane.showInternalConfirmDialog(frame, "Se ha confirmado");
	      
	      JOptionPane.showMessageDialog(frame, "Hello Java");
	      JOptionPane.showMessageDialog(frame, "You have less amount, please recharge","Apocalyptic message", JOptionPane.WARNING_MESSAGE);
	      int result = JOptionPane.showConfirmDialog(null, "Do you want to remo	ve item now?");
	      switch (result) {
	         case JOptionPane.YES_OPTION:
	         System.out.println("Yes");
	         break;
	         case JOptionPane.NO_OPTION:
	         System.out.println("No");
	         break;
	         case JOptionPane.CANCEL_OPTION:
	         System.out.println("Cancel");
	         break;
	         case JOptionPane.CLOSED_OPTION:
	         System.out.println("Closed");
	         break;
	        
	      
	      }
	      
	      String name = JOptionPane.showInputDialog(null, "Please enter your name.");
	      System.out.println(name);
	      JTextField userField = new JTextField();
	      JPasswordField passField = new JPasswordField();
	      String message = "Please enter your user name and password.";
	      result = JOptionPane.showOptionDialog(frame, new Object[] {message, userField, passField},
	      "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
	      if (result == JOptionPane.OK_OPTION)
	      System.out.println(userField.getText() + " " + new String(passField.getPassword()));
	      System.exit(0);
	

	}
}