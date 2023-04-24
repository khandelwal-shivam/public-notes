package Graph;

import java.util.*;

public class DepthFirstSearch {
    Map<Character, List<Character>> adjacencyList;

    public DepthFirstSearch() {
        adjacencyList = new HashMap<>();
    }

    private void DFS(Character source) {
        Set<Character> visitedNodes = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        stack.push(source);
        visitedNodes.add(source);
        while(!stack.isEmpty()) {
            Character current = stack.pop();
            System.out.print(current+" ");
                List<Character> neighbours = adjacencyList.get(current);
                if(neighbours!=null && !neighbours.isEmpty()) {
                for (Character neighbour: neighbours) {
                    if(!visitedNodes.contains(neighbour)) {
                        stack.push(neighbour);
                        visitedNodes.add(neighbour);

                    }
                }}
        }
    }

    public void addEdge (Character source, Character destination) {
        if(!adjacencyList.containsKey(source)) {
            adjacencyList.put(source,new LinkedList<>());
        }
        adjacencyList.get(source).add(destination);
        if(!adjacencyList.containsKey(destination)) {
            adjacencyList.put(destination, new LinkedList<>());
        }
        adjacencyList.get(destination).add(source);
    }

    public static void main(String[] args) {
        DepthFirstSearch graph = new DepthFirstSearch();
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('B', 'E');
        graph.addEdge('C', 'F');
        graph.addEdge('E', 'F');
        graph.DFS('A');
        System.out.println("end");
    }
}
