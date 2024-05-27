using System;

namespace LinearSearch
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 2, 3, 4, 5 };
            int searchingNum = 3;

            Console.WriteLine($"Search index of element ({searchingNum}) in array using linear search: {LinearSearch(nums, searchingNum)}");

            foreach (int num in nums)
                Console.Write($"{num} ");
        }

        private static int LinearSearch(int[] array, int searchingNum)
        {
            for (int i = 0; i < array.Length; i++)
                if (array[i] == searchingNum)
                    return i;

            return -1;
        }
    }
}
