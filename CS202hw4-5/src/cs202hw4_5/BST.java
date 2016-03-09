package cs202hw4_5;

public class BST {
	private Node root;
	private text t;

	private void insertNode(Node currentNode, Node newNode) {
		if (newNode.getValue() < currentNode.getValue()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(newNode);
			} else
				insertNode(currentNode.getLeft(), newNode);
		}
		if (newNode.getValue() > currentNode.getValue()) {
			if (currentNode.getRight() == null) {
				currentNode.setRight(newNode);
			} else
				insertNode(currentNode.getRight(), newNode);
		}

	}

	public void insertValue(int value, String y, int type) {
		if (type <= 3) {
			text n = new nouns(y);
			insertNode(new Node(value, n));
		}
		if (type > 3 || type <= 6) {
			text c1 = new ctp(y);
			insertNode(new Node(value, c1));
		}
		if (type > 6) {
			text c2 = new ctq(y);
			insertNode(new Node(value, c2));
		}

	}

	public Node getNode(Node currentNode, int value) {
		if (currentNode == null) {
			return null;
		}
		if (currentNode.getValue() == value)
			return currentNode;
		if (value < currentNode.getValue())
			return getNode(currentNode.getRight(), value);
		if (value < currentNode.getValue())
			return getNode(currentNode.getLeft(), value);
		return getNode(currentNode.getRight(), value);

	}

	public void insertNode(Node newNode) {
		if (root == null) {
			root = new Node(newNode.getValue(), newNode.getT());
		} else {
			insertNode(root, newNode);
		}
	}

	public void checkDB(Node root) {
		if (root == null)
			return;
		root.displayT();
		// root.getT().test();
		checkDB(root.getLeft());
		checkDB(root.getRight());

	}

	public int searchString(text toSearch) {
		System.out.println("String to search : " + toSearch.getString());
		searchString(toSearch, root);
		return 1;
	}

	public void searchString(text toSearch, Node root) {
		if (root == null) {
			System.out.println("String not found");
			return;
		}
		if (root.getT1() == toSearch.getString()) {
			System.out.println("String found ");
		}
		searchString(toSearch, root.getLeft());
		System.out.println(toSearch.getString());
		System.out.println(root.getT1());
		searchString(toSearch, root.getRight());

	}

	public void checkDB() {
		checkDB(root);

	}

}
