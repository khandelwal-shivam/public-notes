package Graph;

import java.util.*;

public class BreadthFirstSearch {
    private Map<Character, List<Character>> adjacencyList;
    public BreadthFirstSearch() {
        adjacencyList = new HashMap<Character, List<Character>>();
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

    public void BFS(Character source) {
        Set <Character> visitedNodes = new HashSet<>();
        Queue <Character> queue = new LinkedList<>();
        queue.add(source);
        visitedNodes.add(source);
        while(!queue.isEmpty()) {
            Character current = queue.poll();
            System.out.print(current+" ");
            List<Character> neighbours  = adjacencyList.get(current);
            if(neighbours != null && !neighbours.isEmpty()) {
                for (Character neighbour : neighbours) {
                    if(!visitedNodes.contains(neighbour)) {
                        queue.add(neighbour);
                        visitedNodes.add(neighbour);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch graph = new BreadthFirstSearch();
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('B', 'E');
        graph.addEdge('C', 'F');
        graph.addEdge('E', 'F');
        graph.BFS('A');
        System.out.println("end");
    }
    }
