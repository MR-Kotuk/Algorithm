using System;

namespace SelectionSort
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 6, 4, 2, 28 };

            DisplayArray(nums);
            Console.WriteLine("\nSorting array using selection sort:");
            DisplayArray(SelectionSort(nums));
        }

        // O(n^2)
        private static int[] SelectionSort(int[] array)
        {
            for (int i = 0; i < array.Length; i++)
            {
                int minElementIndex = i;

                for (int j = i + 1; j < array.Length; j++)
                    if (array[j] < array[minElementIndex])
                        minElementIndex = j;

                int temp = array[minElementIndex];
                array[minElementIndex] = array[i];
                array[i] = temp;
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
