package starting;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class Main {
	public static void main(String[] args) {
		
		Model m = new Model();
		
		TrianglePuzzleApp tpa = new TrianglePuzzleApp(m);
		tpa.setSize(750, 500);
		tpa.setVisible(true);
	}
}
