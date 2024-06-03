using System;

namespace TernarySearch
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int searchingNum = 8;

            Console.WriteLine($"Search index of element ({searchingNum}) in array using ternary search: {TernarySearch(nums, searchingNum, 0, nums.Length - 1)}");

            foreach (int num in nums)
                Console.Write($"{num} ");
        }

        // O(log 3 n)
        private static int TernarySearch(int[] array, int searchingNum, int left, int right)
        {
            if (right >= left)
            {
                int middleOne = left + (right - left) / 3;
                int middleTwo = right - (right - left) / 3;

                if (searchingNum == array[middleOne])
                    return left;
                else if (searchingNum == array[middleTwo])
                    return right;

                if (searchingNum < array[middleOne])
                    return TernarySearch(array, searchingNum, left, --middleOne);
                else if (searchingNum > array[middleTwo])
                    return TernarySearch(array, searchingNum, ++middleTwo, right);
                else
                    return TernarySearch(array, searchingNum, ++middleOne, --middleTwo);
            }

            return -1;
        }
    }
}
