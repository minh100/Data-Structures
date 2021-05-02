package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
  private Map<Graphs.Vertex, List<Graphs.Vertex>> adjVertices;

  public Graph() {
    this.adjVertices = new HashMap<>();

  }

  public void addVertex(String label) {
    adjVertices.putIfAbsent(new Graphs.Vertex(label), new ArrayList<>());
  }

  public void removeVertex(String label) {
    Graphs.Vertex v = new Graphs.Vertex(label);
    adjVertices.values().stream().forEach(e -> e.remove(v));
    adjVertices.remove(new Graphs.Vertex(label));
  }

  public void addEdge(String label1, String label2) {
    Graphs.Vertex v1 = new Graphs.Vertex(label1);
    Graphs.Vertex v2 = new Graphs.Vertex(label2);
    adjVertices.get(v1).add(v2);
    adjVertices.get(v2).add(v1);

  }

  public void removeEdge(String label1, String label2) {
    Graphs.Vertex v1 = new Graphs.Vertex(label1);
    Graphs.Vertex v2 = new Graphs.Vertex(label2);
    List<Graphs.Vertex> edgesV1 = adjVertices.get(v1);
    List<Graphs.Vertex> edgesV2 = adjVertices.get(v2);
    if(edgesV1 != null) {
      edgesV1.remove(v2);
    }
    if(edgesV2 != null) {
      edgesV2.remove(v1);
    }
  }

  public List<Graphs.Vertex> getAdjVertices(String label) {
    return adjVertices.get(new Graphs.Vertex(label));
  }

  public String printGraph() {
    StringBuffer stringBuffer = new StringBuffer();
    for(Graphs.Vertex v : adjVertices.keySet()) {
      stringBuffer.append(v);
      stringBuffer.append(adjVertices.get(v));
    }

    return stringBuffer.toString();
  }

  // uses a stack and goes deep one direction
  public Set<String> depthFirst(Graph graph, String root) {
    Set<String> visited = new LinkedHashSet<>();
    Stack<String> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()) {
      String vertex = stack.pop();
      if(!visited.contains(vertex)) {
        visited.add(vertex);
        for(Graphs.Vertex v : graph.getAdjVertices(vertex)) {
          stack.push(v.label);
        }
      }
    }
    return visited;
  }

  // uses a queue and goes around one whole level then deeper
  public Set<String> breadthFirst(Graph graph, String root) {
    Set<String> visited = new LinkedHashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(root);
    visited.add(root);
    while(!queue.isEmpty()) {
      String vertex = queue.poll();
      for(Graphs.Vertex v : graph.getAdjVertices(vertex)) {
        if(!visited.contains(v.label)) {
          visited.add(v.label);
        }
      }
    }
    return visited;
  }

}
