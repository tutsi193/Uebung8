package h2;

public class SimpleList {
	
	Node head = null;
	Node first = null;
	Node zeiger = null;
	
	public void erstelleKopf() {
		Node h = head;
	}
	
	public void getFirst() {
		if(first != null) {
			zeiger = first;
		}else {
			zeiger = null;
		}
	}
	
	public void getLast() {
		if(first == null) {
			zeiger = null;
			return;
		}
		zeiger = first;
		while(zeiger.next != null) {
			zeiger = zeiger.next;
		}
	}
	
	public void append(int newValue) {
		Node neu = new Node(newValue);
		if (first == null) {
			first = neu;
			return;
		}
		zeiger = first;
		
		while(zeiger.next != null) {
			zeiger = zeiger.next;
		}
		zeiger.next = neu;
	}
	
	public void findFirst(int value) {
		if(first == null) {
			zeiger = null;
			return;
		}
		zeiger = first;
		while(zeiger != null) {
			if(zeiger.value == value) {
				return;
			}
			zeiger = zeiger.next;
		}
		zeiger = null;
	}
	
	public boolean insertAfter(int preValue, int newValue) {
		zeiger = first;
		while(zeiger != null) {
			if(zeiger.value == preValue) {
				Node v = new Node(newValue);
				v.next = zeiger.next;
				zeiger.next = v;
				return true;
			}
			zeiger = zeiger.next;
		}
		return false;
		
		
	}
	
	public boolean delete(int value) {
		zeiger = first;
		if(first == null) return false;
		if(first.value == value) {
			first = first.next;
			return true;
		}
		
		Node vorher = first;
		zeiger = first.next;
		
		while(zeiger != null) {
			if(zeiger.value == value) {
				vorher.next = zeiger.next;
				return true;
			}
			vorher = zeiger;
			zeiger = zeiger.next;
		}
		return false;
	}
	
	public void printList() {
		zeiger = first;

		if (zeiger == null) {
			System.out.println("Liste ist leer");
			return;
		}

		while (zeiger != null) {
			System.out.println(zeiger.value);
			zeiger = zeiger.next;
		}
	}
}
