package h2;

public class H2_main {
	public static void main(String[] args) {
		SimpleList myList = new SimpleList();
		myList.append(12);
		myList.append(45);
		myList.append(66);
		myList.append(12);
		myList.append(45);
		myList.append(60);
		
		myList.printList(); // originale Liste
		myList.insertAfter(45,4);
		myList.printList(); // 4 hinzugefügt
		
		myList.findFirst(45);
		myList.delete(45); 
		myList.printList();// 45 gelöscht
	}
}

/*echo "# Uebung8" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote set-url origin https://github.com/tutsi193/Uebung8.git
git push -u origin main*/