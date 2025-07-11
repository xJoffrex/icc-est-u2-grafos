package src.Controllers;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import src.Models.Node;

public class Graph{

    private Set<Node> nodes;

    public Graph(){
        this.nodes = new HashSet<>();
    }

    public Node addNode(int value){
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void addEdgeUni(Node src, Node des){
        src.addNeighbor(des);
    }


    public void printGraph() {
        List<Node> sortedNodes = new ArrayList<>(nodes);
        sortedNodes.sort(Comparator.comparingInt(Node::getValue));

        for (Node node : sortedNodes) {
            System.out.print("Vertice: " + node.getValue());

            List<Node> sortedNeighbors = new ArrayList<>(node.getNeighbors());
            sortedNeighbors.sort(Comparator.comparingInt(Node::getValue));

            for (int i = 0; i < sortedNeighbors.size(); i++) {
                System.out.print(" -> " + sortedNeighbors.get(i).getValue());
            }
            System.out.println();
        }
    }



    public void getDFS(Node startNode){

    }

    private void getDFS(Node node, boolean[] visited){

    }

    public void getBFS(Node startNode){

    }

    public int[][] getAdjacencyMatrix(){
        return new int[2][3];
    }

    public void printAdjacencyMatrix(){
        
    }
}