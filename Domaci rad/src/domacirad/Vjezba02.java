package domacirad;

//za unesena 3 broja ispišite najmanji

import javax.swing.JOptionPane;

public class Vjezba02 {
	public static void main(String[] args) {
		int prvibroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugibroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int trecibroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));

		if (prvibroj > drugibroj & prvibroj > trecibroj) {
			System.out.println("Ovo je najveci broj " + prvibroj);
		} else if (drugibroj > prvibroj & drugibroj > trecibroj) {
			System.out.println("Ovo je najveci broj " + drugibroj);
		} else if(trecibroj>prvibroj & trecibroj>drugibroj)
			System.out.println("Ovo je najveci broj " + trecibroj );
	}

}
