package h1;

public class Bruch {
	public int zaehler;
	public int nenner;
	
	public Bruch(int Zaehler, int Nenner) {
		this.zaehler = Zaehler;
		this.nenner = Nenner;
	}
	
	private int ggT(int x, int y) {
		 
		 if (x == 0) return y;
		 if (y == 0) return x;
		 
		 while( y != 0) {
			 int r = x % y;
			 x = y;
			 y = r;
		 }
		 return x;
	}
	
	public void shorten() {
		int n = ggT(zaehler,nenner);
		zaehler = zaehler / n;
		nenner = nenner / n;
		
		if (zaehler < 0) {
			 zaehler = zaehler * (-1);
		}
		if (nenner < 0) {
			 nenner = nenner * (-1);
		}
		System.out.println("Gekürzter Bruch: " + zaehler + ":" + nenner);
	}
	
	public boolean hasSameValueAs(Bruch b) {
		if (this.zaehler % b.zaehler == 0 && this.nenner % b.nenner == 0 || b.zaehler % this.zaehler == 0 && b.nenner % this.nenner == 0 ) {
			boolean hasSameValueAs = true;
			System.out.println("Gleicher Bruch wie Bruch b.");
			return hasSameValueAs;
		}
		System.out.println("Unterschiedliche Brüche.");
		return false;
		
	}
}
