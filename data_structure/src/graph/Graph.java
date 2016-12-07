package data_structure.src.graph;

import data_structure.src.graph.Interface.IGraph;
import data_structure.src.graph.Interface.Node;
import data_structure.src.graph.exception.UnsuppotedOperation;

import java.util.Iterator;

/**
 * Created by jinxufei on 2016/12/6.
 */
public class Graph implements IGraph {
    /**
     * 返回图的类型
     *
     * @return
     */
    @Override
    public int getType() {
        return 0;
    }

    /**
     * 返回图的顶点数
     *
     * @return
     */
    @Override
    public int getVexNum() {
        return 0;
    }

    /**
     * 返回图的边数
     *
     * @return
     */
    @Override
    public int getEdgeNum() {
        return 0;
    }

    /**
     * 返回图的所有顶点
     *
     * @return
     */
    @Override
    public Iterator getVertex() {
        return null;
    }

    /**
     * 返回图的所有边
     *
     * @return
     */
    @Override
    public Iterator getEdge() {
        return null;
    }

    /**
     * 删除一个顶点
     *
     * @param vertex
     */
    @Override
    public void remove(Vertex vertex) {

    }

    /**
     * 删除一个边
     *
     * @param edge
     */
    @Override
    public void remove(Edge edge) {

    }

    /**
     * 增加一个订点
     *
     * @param vertex
     * @return
     */
    @Override
    public Node insert(Vertex vertex) {
        return null;
    }

    /**
     * 增加一条边
     *
     * @param edge
     * @return
     */
    @Override
    public Node insert(Edge edge) {
        return null;
    }

    /**
     * 判断顶点u v是否领接
     *
     * @param v
     * @param u
     * @return
     */
    @Override
    public boolean areAdjacent(Vertex v, Vertex u) {
        return false;
    }

    /**
     * 返回从u指向v的边，不存在返回null
     *
     * @param v
     * @param u
     * @return
     */
    @Override
    public Edge edgeFromTo(Vertex v, Vertex u) {
        return null;
    }

    /**
     * 返回从u出发可以直接到达的领接顶点
     *
     * @param vertex
     * @return
     */
    @Override
    public Iterator adjVertexs(Vertex vertex) {
        return null;
    }

    /**
     * 对图进行深度优先遍历
     *
     * @param vertex
     * @return
     */
    @Override
    public Iterator DFSTraverse(Vertex vertex) {
        return null;
    }

    /**
     * 对图进行广度优先遍历
     *
     * @param vertex
     * @return
     */
    @Override
    public Iterator BFSTranverse(Vertex vertex) {
        return null;
    }

    /**
     * 求顶点v到其他顶点的最短路径
     *
     * @param vertex
     * @return
     */
    @Override
    public Iterator shortestPath(Vertex vertex) {
        return null;
    }

    /**
     * 求无向图的最小生成树
     *
     * @throws UnsuppotedOperation
     */
    @Override
    public void generateMST() throws UnsuppotedOperation {

    }

    /**
     * 求有向图的拓扑序列，无向图不支持此操作
     *
     * @return
     * @throws UnsuppotedOperation
     */
    @Override
    public Iterator toplogicalSort() throws UnsuppotedOperation {
        return null;
    }

    /**
     * 求有无环图的关键路径 ，无向图不支持此操作
     *
     * @throws UnsuppotedOperation
     */
    @Override
    public void criticalPath() throws UnsuppotedOperation {

    }
}
