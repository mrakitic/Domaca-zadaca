package domacirad;

import javax.swing.JOptionPane;

public class Vjezba01 {
	
	public static void main(String[] args) {
		int prvibroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		System.out.println(prvibroj);
		
		int drugibroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		System.out.println(drugibroj);
		
		if(prvibroj>drugibroj) {
			System.out.println("Veci broj je " + prvibroj);
		}else { 
			System.out.println("Veci broj je " + drugibroj);
		}
	}

}
