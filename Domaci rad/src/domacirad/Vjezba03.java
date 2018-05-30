package domacirad;

import javax.swing.JOptionPane;

public class Vjezba03 {
	
	// program unosi dva imena i ispisuje koliko posto se oni vole
	
	public static void main(String[] args) {
		String prvoime = JOptionPane.showInputDialog("Unesi prvo ime:");
		String drugoime = JOptionPane.showInputDialog("Unesi drugo ime:");
		
		System.out.println(prvoime + " i " + drugoime + " se vole " + Math.random()*100 + "%");
	}

}
