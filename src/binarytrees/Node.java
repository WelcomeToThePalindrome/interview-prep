package binarytrees;

/*
 * NOTES:
 * I vaguely remember calling node.data/value or
 * node.left/right in CS100, if I'm not mistaken.
 * I'm using public variables and not prefixing 
 * variable names with my- just out of familiarity.
 * These can easily be changed with re-factoring and
 * reduced visibility / adding getter methods.
 */


public class Node {

	public String value;
	public Node left;
	public Node right;
	
	public Node (String value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
}
