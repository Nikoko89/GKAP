package aufgabe1;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;


public class Test {

	public static void main(String args[]) {
		Graph graph = new MultiGraph("Tutorial 1");
		
		graph.addNode("A");
		graph.getNode("A").addAttribute("ui.label", "A");
		graph.addNode("B").addAttribute("ui.label", "B");
		graph.addNode("C").addAttribute("ui.label", "C");
		graph.addEdge("AB", "A", "B");
		graph.addEdge("AA", "A", "A");
		graph.addEdge("BC", "B", "C");
		graph.addEdge("CA", "C", "A");
		System.out.println(graph.getEdge("AA").isLoop());
		
		graph.display();
	}
}
