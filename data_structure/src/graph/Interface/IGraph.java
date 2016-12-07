package data_structure.src.graph.Interface;

import data_structure.src.graph.Edge;
import data_structure.src.graph.Vertex;
import data_structure.src.graph.exception.UnsuppotedOperation;

import java.util.Iterator;

/**
 * Created by jinxufei on 2016/12/6.
 */
public interface IGraph {

    public static final int UndirectedGraph = 0; //无向图
    public static final int DirectedGraph = 1; //有向图

    /**
     * 返回图的类型
     * @return
     */
    int getType();

    /**
     * 返回图的顶点数
     * @return
     */
    int getVexNum();

    /**
     * 返回图的边数
     * @return
     */
    int getEdgeNum();

    /**
     * 返回图的所有顶点
     * @return
     */
    Iterator getVertex();

    /**
     * 返回图的所有边
     * @return
     */
    Iterator getEdge();

    /**
     *删除一个顶点
     */
    void remove(Vertex vertex);

    /**
     * 删除一个边
     * @param edge
     */
    void remove(Edge edge);

    /**
     * 增加一个订点
     * @param vertex
     * @return
     */
    Node insert(Vertex vertex);

    /**
     * 增加一条边
     * @param edge
     * @return
     */
    Node insert(Edge edge);

    /**
     * 判断顶点u v是否领接
     * @param v
     * @param u
     * @return
     */
    boolean areAdjacent(Vertex v,Vertex u);

    /**
     * 返回从u指向v的边，不存在返回null
     * @param v
     * @param u
     * @return
     */
    Edge edgeFromTo(Vertex v,Vertex u);

    /**
     * 返回从u出发可以直接到达的领接顶点
     * @param vertex
     * @return
     */
    Iterator adjVertexs(Vertex vertex);

    /**
     * 对图进行深度优先遍历
     * @param vertex
     * @return
     */
    Iterator DFSTraverse(Vertex vertex);

    /**
     * 对图进行广度优先遍历
     * @param vertex
     * @return
     */
    Iterator BFSTranverse(Vertex vertex);

    /**
     * 求顶点v到其他顶点的最短路径
     * @param vertex
     * @return
     */
    Iterator shortestPath(Vertex vertex);

    /**
     * 求无向图的最小生成树
     * @throws UnsuppotedOperation
     */
    void generateMST()throws UnsuppotedOperation;

    /**
     * 求有向图的拓扑序列，无向图不支持此操作
     * @return
     * @throws UnsuppotedOperation
     */
    Iterator toplogicalSort()throws UnsuppotedOperation;

    /**
     * 求有无环图的关键路径 ，无向图不支持此操作
     * @throws UnsuppotedOperation
     */
    void criticalPath()throws UnsuppotedOperation;


}
