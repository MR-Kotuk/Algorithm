public class Searching {
    // O(n)
    public static int linearSearch(int[] array, int searchingNum) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == searchingNum)
                return i;

        return -1;
    }

    // O(log n)
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target)
                return middle;

            if (array[middle] < target)
                left = middle + 1;
            else
                right = middle - 1;
        }

        return -1;
    }

    // O(log 3 n)
    public static int ternarySearch(int[] array, int searchingNum, int left, int right) {
        if (right >= left) {
            int middleOne = left + (right - left) / 3;
            int middleTwo = right - (right - left) / 3;

            if (searchingNum == array[middleOne])
                return left;
            else if (searchingNum == array[middleTwo])
                return right;

            if (searchingNum < array[middleOne])
                return ternarySearch(array, searchingNum, left, --middleOne);
            else if (searchingNum > array[middleTwo])
                return ternarySearch(array, searchingNum, ++middleTwo, right);
            else
                return ternarySearch(array, searchingNum, ++middleOne, --middleTwo);
        }

        return -1;
    }
}