package data_structure.src.graph;


import data_structure.src.graph.Interface.Node;

public class Edge {
	public static final int NORMAL = 0;
	public static final int MST = 1;
	public static final int CRITICAL = 2;
	private int weight;
	private Object info;
	private Node edgePosition;
	private Node firstVexPosition;
	private Node secondVexPosition;
	private Node edgeFirstPosition;
	private Node egdeSecondPosition;
	private int type;
	private int graphType;

	public Edge(Graph g, Vertex u, Vertex v, Object info){
		this(g,u,v,info,1);
	}
	public Edge(Graph g, Vertex u, Vertex v, Object info, int weight) {
		this.info = info;
		this.weight = weight;
		edgePosition = g.insert(this);
		firstVexPosition = u.getVexPosition();
		secondVexPosition = v.getVexPosition();
		type = Edge.NORMAL;
		graphType = g.getType();
		if (graphType==Graph.UndirectedGraph){
			//edgeFirstPosition = u.getAdjacentEdges().insertLast(this);
			//egdeSecondPosition = v.getAdjacentEdges().insertLast(this);
		}else {
			//edgeFirstPosition = u.getAdjacentEdges().insertLast(this);
			//egdeSecondPosition = v.getReAdjacentEdges().insertLast(this);
		}
	}
	
	//get&set methods
	public Object getInfo(){ return info;}
	public void setInfo(Object obj){ this.info = info;}
	public int getWeight(){ return weight;}
	public void setWeight(int weight){ this.weight = weight;}
	public Vertex getFirstVex(){ return (Vertex)firstVexPosition.getData();}
	public Vertex getSecondVex(){ return (Vertex)secondVexPosition.getData();}
	public Node getFirstVexPosition(){ return firstVexPosition;}
	public Node getSecondVexPosition(){ return secondVexPosition;}
	public Node getEdgeFirstPosition(){ return edgeFirstPosition;}
	public Node getEdgeSecondPosition(){ return egdeSecondPosition;}
	public Node getEdgePosition(){ return edgePosition;}
	
	public void setToMST(){ type = Edge.MST;}
	public void setToCritical(){ type = Edge.CRITICAL;}
	public void resetType(){ type = Edge.NORMAL;}	
	public boolean isMSTEdge(){ return type==Edge.MST;}
	public boolean isCritical(){ return type==Edge.CRITICAL;}
}
