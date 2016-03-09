package cs202hw4_5;

public class Node {
	private int value;
	private Node left;
	private Node right;
	private text t;

	public Node(int value, text t) {

		this.value = value;
		left = null;
		right = null;
		this.t = t;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getValue() {
		return value;
	}

	public String getText(text t) {
		return t.getString();
	}

	public text getT() {
		return t;
	}

	public String getT1() {
		return t.getString();

	}

	public void displayT() {
		t.display_string();
	}

}
