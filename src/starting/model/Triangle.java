package starting.model;

public class Triangle {
	
	public final Edge e1;
	public final Edge e2;
	public final Edge e3;
	
	public Triangle(Edge e1, Edge e2, Edge e3) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	public Edge getEdge1() {
		return this.e1;
	}
	
	public Edge getEdge2() {
		return this.e2;
	}
	
	public Edge getEdge3() {
		return this.e3;
	}
}
