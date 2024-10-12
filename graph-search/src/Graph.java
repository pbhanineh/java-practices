import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();

        private Node(int id) {
            this.id = id;
        }
    }

    // Obtenir un nœud par son identifiant ou le créer s'il n'existe pas
    private Node getNode(int id) {
        if (!nodeLookup.containsKey(id)) {
            nodeLookup.put(id, new Graph.Node(id));
        }
        return nodeLookup.get(id);
    }

    public void addEdge(int source, int destination) {
        Node s = getNode(source);  // Get the source node
        Node d = getNode(destination);  // Get the destination node
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
        if (visited.contains(source.id)) { // si deja visiter ==> false
            return false;
        }
        visited.add(source.id);
        if (source == destination) {
            return true;
        }
        for (Node child : source.adjacent) {
            if (hasPathDFS(child, destination, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int s, int d) {
        Node source = getNode(s);
        Node destination = getNode(d);
        LinkedList<Node> nextNodeToVisit = new LinkedList<>(); // comme une list et comme une queur car elle implemete les deux
        HashSet<Integer> visited = new HashSet<>();
        nextNodeToVisit.add(source);
        while (!nextNodeToVisit.isEmpty()) {
            Node node = nextNodeToVisit.remove();
            if (node == destination) {
                return true;
            }
            if (visited.contains(node.id)) {
                continue;
            }
            visited.add(node.id);
            for (Node child : node.adjacent) {
                nextNodeToVisit.add(child);
            }
        }
        return false;
    }

}
