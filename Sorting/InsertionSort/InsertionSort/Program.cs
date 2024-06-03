using System;

namespace InsertionSort
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 6, 4, 2, 28 };

            DisplayArray(nums);
            Console.WriteLine("\nSorting array using insertion sort:");
            DisplayArray(InsertionSort(nums));
        }

        // O(n^2)
        private static int[] InsertionSort(int[] array)
        {
            for (int i = 0; i < array.Length; ++i)
            {
                int currentElement = array[i];
                int lastElementIndex = i - 1;

                while (lastElementIndex >= 0 && array[lastElementIndex] > currentElement)
                {
                    array[lastElementIndex + 1] = array[lastElementIndex];
                    lastElementIndex--;
                }

                array[lastElementIndex + 1] = currentElement;
            }

            return array;
        }

        private static void DisplayArray(int[] array)
        {
            foreach (int num in array)
                Console.Write($"{num} ");
        }
    }
}