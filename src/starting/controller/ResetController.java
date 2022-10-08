package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class ResetController {
	
	TrianglePuzzleApp app;
	Model model;
	
	public ResetController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("you pressed reset");
	}
	
}
