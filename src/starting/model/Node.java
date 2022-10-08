package starting.model;

public class Node {
	
	public final int id;
	boolean selected;
	
	public Node(int id) {
		this.id = id;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public int getId() {
		return this.id;
	}
}
