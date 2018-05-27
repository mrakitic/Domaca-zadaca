package damacazadaca;

import javax.swing.JOptionPane;
public class PrimitivniTipovi {
	
		public static void main(String[] args) {
			byte broj = Byte.parseByte(JOptionPane.showInputDialog("Unesi broj izmedu -128 i 127"));
			System.out.println(" " + broj);
			
			short brojdva = Short.parseShort(JOptionPane.showInputDialog("Unesi broj izmedu -32768 i 32767"));
			System.out.println(" " + brojdva);
			
			int brojtri = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
			System.out.println(" " + brojtri);
			
			long brojcetiri = Long.parseLong(JOptionPane.showInputDialog("Unesi jos veci cijeli broj"));
			System.out.println(" " + brojcetiri);
			
			float f = Float.parseFloat(JOptionPane.showInputDialog("Unesi decimalni broj sa tockom"));
			System.out.println(" " + f);
			
			double d = Double.parseDouble(JOptionPane.showInputDialog("Unesi jos tocniju decimalu tog broja"));
			System.out.println(" " + d);
			
			char c = 'A';
			System.out.println(" Prvo slovo abecede je " + c);
			
			boolean k = true;
			System.out.println(" Jesi li isao na svako predavanje do sad? " + k);
		}

	}


