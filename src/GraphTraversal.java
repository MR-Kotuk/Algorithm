import java.util.*;

public class GraphTraversal {
    // O(V + E)
    public static void dfsIterative(int start, Map<Integer, List<Integer>> graph) {
        System.out.println("DFS Traversal O(V + E):");

        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(start);

        int node = -1;
        while (!stack.isEmpty()) {
            node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
                Collections.reverse(neighbors);
                stack.addAll(neighbors);
            }
        }
    }

    // O(V + E)
    public static void bfsIterative(int start, Map<Integer, List<Integer>> graph) {
        System.out.println("BFS Traversal O(V + E):");

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);

        int node = -1;
        while (!queue.isEmpty()) {
            node = queue.poll();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                for (int neighbor : graph.getOrDefault(node, new ArrayList<>()))
                    if (!visited.contains(neighbor))
                        queue.add(neighbor);
            }
        }
    }
}