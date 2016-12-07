package data_structure.src.graph;


import data_structure.src.graph.Interface.Node;

import java.util.LinkedList;

public class Vertex {
	private Object info;
	private LinkedList adjacentEdges;
	private LinkedList reAdjacentEdges;
	private boolean visited;
	private Node vexPosition;
	private int graphType;
	private Object application;

	public Vertex(Graph g, Object info) {
		this.info = info;
		//adjacentEdges = new LinkedListDLNode();
		//reAdjacentEdges = new LinkedListDLNode();
		visited = false;
		graphType = g.getType();
		vexPosition = g.insert(this);
		application = null;
	}

	private boolean isUnDiGraphNode(){ return graphType==Graph.UndirectedGraph;}
	

	public Object getInfo(){ return info;}
	public void setInfo(Object obj){ this.info = info;}
	

/*	public int getDeg(){
		if (isUnDiGraphNode())
			//return adjacentEdges.getSize();
		else
			return getOutDeg()+getInDeg();
	}*/
	/*public int getOutDeg(){
		return adjacentEdges.getSize();
	}*/
	/*public int getInDeg(){
		if (isUnDiGraphNode())
			return adjacentEdges.getSize();
		else
			return reAdjacentEdges.getSize();
	}*/
	
	public LinkedList getAdjacentEdges(){ return adjacentEdges;}
	public LinkedList getReAdjacentEdges(){
		if (isUnDiGraphNode())
			return adjacentEdges;
		else
			return reAdjacentEdges;
	}
	
	public Node getVexPosition(){ return vexPosition;}

	public boolean isVisited(){ return visited;}
	public void setToVisited(){ visited = true;}
	public void setToUnvisited(){ visited = false;}
	
	protected Object getAppObj(){ return application;}
	protected void setAppObj(Object app){ application = app;}
	
	public void resetStatus(){
		visited = false;
		application = null;
	}
}
