package h2;

public class Node {
	public Node next;
	public int value = Integer.MIN_VALUE;
	
	public Node(int pValue) {
		this.value = pValue;
		this.next = null;
	}
	public void next() {
		this.next = null;
	}
	
}