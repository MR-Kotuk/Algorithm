using System;

namespace MergeSort
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 6, 4, 2, 28 };

            DisplayArray(nums);
            Console.WriteLine("\nSorting array using merge sort:");
            MergeSort(nums, 0, nums.Length - 1);
            DisplayArray(nums);
        }

        // O(n log n)
        private static void MergeSort(int[] array, int left, int right)
        {
            if (left < right)
            {
                int middle = left + (right - left) / 2;

                MergeSort(array, left, middle);
                MergeSort(array, middle + 1, right);

                Merge(array, left, middle, right);
            }
        }

        private static void Merge(int[] array, int left, int middle, int right)
        {
            int sizeOne = middle - left + 1;
            int sizeTwo = right - middle;

            int[] arrayOne = new int[sizeOne];
            int[] arrayTwo = new int[sizeTwo];

            for (int i = 0; i < sizeOne; i++)
                arrayOne[i] = array[left + i];
            for (int i = 0; i < sizeTwo; i++)
                arrayTwo[i] = array[middle + 1 + i];

            int indexOne = 0;
            int indexTwo = 0;

            int l = left;

            while (indexOne < sizeOne && indexTwo < sizeTwo)
            {
                if (arrayOne[indexOne] <= arrayTwo[indexTwo])
                {
                    array[l] = arrayOne[indexOne];
                    indexOne++;
                }
                else
                {
                    array[l] = arrayTwo[indexTwo];
                    indexTwo++;
                }

                l++;
            }

            while (indexOne < sizeOne)
            {
                array[l] = arrayOne[indexOne];
                indexOne++;
                l++;
            }

            while (indexTwo < sizeTwo)
            {
                array[l] = arrayTwo[indexTwo];
                indexTwo++;
                l++;
            }
        }

        private static void DisplayArray(int[] array)
        {
            foreach (int num in array)
                Console.Write($"{num} ");
        }
    }
}