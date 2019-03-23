
public class Node {
	public Node parent;
	public Node left;
	public Node right;
	public Node child;
	public int degree;
	public boolean mark;
	public long key;
	public String keyword;
	
	public Node( String keyword, long key) {
		this.key = key;
		this.keyword = keyword;
		this.left = this;
		this.right = this;
	
		this.degree = 0;
	
	}
	
}
