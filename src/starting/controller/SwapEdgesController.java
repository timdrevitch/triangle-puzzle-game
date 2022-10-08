package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class SwapEdgesController {
	TrianglePuzzleApp app;
	Model model;
	
	public SwapEdgesController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("you pressed swap edges");
	}
}
