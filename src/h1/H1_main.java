package h1;

public class H1_main {
	public static void main(String[] args) {
		Bruch b1 = new Bruch(125,100);
		b1.shorten();
		
		Bruch b = new Bruch(10,8);
		b1.hasSameValueAs(b);
	}
}
