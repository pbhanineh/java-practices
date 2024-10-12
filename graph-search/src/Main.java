public class Main {
    // une method static est une method qui peut etre appeler sans instancier la classe dans laquelle elle est decalré
    public static void main(String[] args) {
        Graph graph = new Graph();  // Create an instance of your graph

        // Add edges to the graph (create the connections)
        graph.addEdge(1, 2);  // Edge from node 1 to node 2
        graph.addEdge(1, 3);  // Edge from node 1 to node 3
        graph.addEdge(2, 4);  // Edge from node 2 to node 4
        graph.addEdge(3, 5);  // Edge from node 3 to node 5
        graph.addEdge(4, 6);  // Edge from node 4 to node 6
        graph.addEdge(5, 6);  // Edge from node 5 to node 6

        // Test the DFS path existence
//        System.out.println("Path from 1 to 6: " + graph.hasPathDFS(1, 6));  // Expected: true
//        System.out.println("Path from 1 to 5: " + graph.hasPathDFS(1, 5));  // Expected: true
//        System.out.println("Path from 2 to 5: " + graph.hasPathDFS(2, 5));  // Expected: false
//        System.out.println("Path from 4 to 6: " + graph.hasPathDFS(4, 6));  // Expected: true
//        System.out.println("Path from 6 to 1: " + graph.hasPathDFS(6, 1));  // Expected: false


        // Test des chemins dans le graphe avec BFS
        System.out.println("BFS: Path from 1 to 6: " + graph.hasPathBFS(1, 6));  // Attendu : true
        System.out.println("BFS: Path from 1 to 5: " + graph.hasPathBFS(1, 5));  // Attendu : true
        System.out.println("BFS: Path from 2 to 5: " + graph.hasPathBFS(2, 5));  // Attendu : false
        System.out.println("BFS: Path from 4 to 6: " + graph.hasPathBFS(4, 6));  // Attendu : true
        System.out.println("BFS: Path from 6 to 1: " + graph.hasPathBFS(6, 1));  // Attendu : false
    }
}