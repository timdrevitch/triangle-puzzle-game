package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class UnselectAllController {
	TrianglePuzzleApp app;
	Model model;
	
	public UnselectAllController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("you pressed unselect all");
		
	}
}
