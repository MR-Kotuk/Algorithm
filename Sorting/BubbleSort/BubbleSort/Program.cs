using System;

namespace BubbleSort
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 6, 4, 2, 28 };

            DisplayArray(nums);
            Console.WriteLine("\nSorting array using bubble sort:");
            DisplayArray(BubbleSort(nums));
        }

        // O(n^2)
        private static int[] BubbleSort(int[] array)
        {
            for (int i = 0; i < array.Length - 1; i++)
            {
                bool isSwapped = false;

                for (int j = 0; j < array.Length - i - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        isSwapped = true;
                    }
                }

                if (!isSwapped)
                    break;
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