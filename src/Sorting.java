public class Sorting {
    // O(n^2)
    public static int[] bubbleSort(int[] array) {
        System.out.println("Bubble Sort O(n^2):");

        for (int i = 0; i < array.length - 1; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped)
                break;
        }

        return array;
    }

    // O(n^2)
    public static int[] insertionSort(int[] array) {
        System.out.println("Insertion Sort O(n^2):");

        for (int i = 0; i < array.length; ++i) {
            int currentElement = array[i];
            int lastElementIndex = i - 1;

            while (lastElementIndex >= 0 && array[lastElementIndex] > currentElement) {
                array[lastElementIndex + 1] = array[lastElementIndex];
                lastElementIndex--;
            }

            array[lastElementIndex + 1] = currentElement;
        }

        return array;
    }

    // O(n log n)
    public static void mergeSort(int[] array, int left, int right) {
        System.out.println("Merge Sort O(n log n):");

        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int sizeOne = middle - left + 1;
        int sizeTwo = right - middle;

        int[] arrayOne = new int[sizeOne];
        int[] arrayTwo = new int[sizeTwo];

        System.arraycopy(array, left, arrayOne, 0, sizeOne);
        for (int i = 0; i < sizeTwo; i++)
            arrayTwo[i] = array[middle + 1 + i];

        int indexOne = 0;
        int indexTwo = 0;
        int l = left;

        while (indexOne < sizeOne && indexTwo < sizeTwo) {
            if (arrayOne[indexOne] <= arrayTwo[indexTwo]) {
                array[l] = arrayOne[indexOne];
                indexOne++;
            } else {
                array[l] = arrayTwo[indexTwo];
                indexTwo++;
            }

            l++;
        }

        while (indexOne < sizeOne) {
            array[l] = arrayOne[indexOne];
            indexOne++;
            l++;
        }

        while (indexTwo < sizeTwo) {
            array[l] = arrayTwo[indexTwo];
            indexTwo++;
            l++;
        }
    }

    // O(n^2)
    public static void quickSort(int[] array, int low, int high) {
        System.out.println("Quick Sort O(n^2):");

        if (low < high) {
            int pivot = partition(array, low, high);

            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pivotIndex = low;

        for (int j = low; j < high; j++)
            if (array[j] < pivot)
                swap(array, pivotIndex++, j);

        swap(array, pivotIndex, high);
        return pivotIndex;
    }

    // O(n^2)
    public static int[] selectionSort(int[] array) {
        System.out.println("Selection Sort O(n^2):");

        for (int i = 0; i < array.length; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[minElementIndex])
                    minElementIndex = j;

            swap(array, minElementIndex, i);
        }

        return array;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}