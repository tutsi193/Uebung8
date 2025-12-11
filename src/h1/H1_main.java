package h1;

public class H1_main {
	public static void main(String[] args) {
		Bruch b1 = new Bruch(125,100);
		b1.shorten();
		
		Bruch b = new Bruch(10,8);
		b1.hasSameValueAs(b);
	}
}
/*echo "# Uebung8" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote set-url origin https://github.com/tutsi193/Uebung8.git
git push -u origin main*/