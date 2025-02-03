public class Main {
    public static void main(String[] args) {
        checkSearching();
        checkSorting();
    }

    private static void checkSearching() {
        System.out.println("\n// Searching algorithms: //");

        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        int searchingNum = 3;
        int result = Searching.linearSearch(nums, searchingNum);

        System.out.println("Search index of element (" + searchingNum + ") in array: " + result);
        displayArray(nums);
    }

    private static void checkSorting() {
        System.out.println("\n// Sorting algorithms: //");

        int[] nums = new int[] { 1, 6, 4, 2, 28 };

        displayArray(nums);
        System.out.println("\nSorted array:");
        displayArray(Sorting.bubbleSort(nums));
    }

    private static void displayArray(int[] nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}