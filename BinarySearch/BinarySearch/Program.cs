using System;

namespace BinarySearch
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 2, 3, 4, 5 };
            int searchingNum = 4;

            Console.WriteLine($"Search index of element ({searchingNum}) in array using binary search: {BinarySearch(nums, searchingNum)}");

            foreach (int num in nums)
                Console.Write($"{num} ");
        }

        // O(log n)
        public static int BinarySearch(int[] array, int target)
        {
            int left = 0;
            int right = array.Length - 1;

            while (left <= right)
            {
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
    }
}
