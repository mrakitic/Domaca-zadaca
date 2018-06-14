package domacirad;

public class Projekt1 {
	  

	public static void main(String[] args) {
		
		String [] gradovi = {"Tilted","Dusty", "Retail","Snobby","Haunted","Junk","Shifty"};
		
		//System.out.println(gradovi.length);
		
		
		double r;
		int b;
		
		while(true) {
			
			r = Math.random()*100;
			b = (int)r;
			if(b<gradovi.length) {
				break;
			}
		}
		
		System.out.println(gradovi[b]);
				}
				
				
	




		
	

	}

