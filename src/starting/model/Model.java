package starting.model;
import java.awt.Color;



public class Model {
	
	Node node;
	Edge edge;
	Triangle triangle;
	TrianglePuzzle puzzle;
	
	public Model() {
		puzzle = new TrianglePuzzle();
//		triangle = new Triangle(Triangle.getEdge1(), Triangle.getEdge2(), Triangle.getEdge3());
//		edge = new Edge(Edge.getNode1(), Edge.getNode2(), Edge.getColor());
//		node = new Node.getId();
	}
	
	public TrianglePuzzle getPuzzle() {
		return puzzle;
	}
	
	public Node getNode() {
		return node;
	}
	
	public Edge getEdge() {
		return edge;
	}
	
	public Triangle getTriangle() {
		return triangle;
	}
	
}
