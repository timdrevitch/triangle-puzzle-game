package starting.model;
import java.awt.Color;

public class Edge {
	
	Color color;
	public final Node n1;
	public final Node n2;
	
	public Edge (Node n1, Node n2, Color c) {
		this.n1 = n1;
		this.n2 = n2;
		this.color = c;
	}
	
	public Node getNode1() {
		return this.n1;
	}
	
	public Node getNode2() {
		return this.n2;
	}
	
	public Color getColor() {
		return this.color;
	}
	
}
