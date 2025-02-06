import java.util.*;

public class Main {
    public static void main(String[] args) {
        searching();
        sorting();
        graphTraversal();
    }

    private static void searching() {
        System.out.println("\n\n// Searching algorithms: //");

        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        int searchingNum = 3;
        int result = Searching.linearSearch(nums, searchingNum);

        System.out.println("Search index of element (" + searchingNum + ") in array: " + result);
        displayArray(nums);
    }

    private static void sorting() {
        System.out.println("\n\n// Sorting algorithms: //");

        int[] nums = new int[] { 1, 6, 4, 2, 28 };

        displayArray(nums);
        System.out.println("\nSorted array:");
        displayArray(Sorting.bubbleSort(nums));
    }

    private static void graphTraversal() {
        System.out.println("\n\n// Graph traversal algorithms: //");

        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6));
        graph.put(4, Collections.emptyList());
        graph.put(5, Collections.emptyList());
        graph.put(6, Collections.emptyList());
        displayGraph(graph);

        GraphTraversal.bfsIterative(1, graph);
    }

    private static void displayGraph(Map<Integer, List<Integer>> graph) {
        System.out.println("Graph Representation:");
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet())
            System.out.println("Node " + entry.getKey() + " -> " + entry.getValue());
    }

    private static void displayArray(int[] nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}