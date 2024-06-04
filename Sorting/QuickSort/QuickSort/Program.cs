using System;

namespace QuickSort
{
    public class Program
    {
        public static void Main()
        {
            int[] nums = new int[] { 1, 6, 4, 2, 28, 3, 56, 12 };

            DisplayArray(nums);
            Console.WriteLine("\nSorting array using quick sort:");
            QuickSort(nums, 0, nums.Length - 1);
            DisplayArray(nums);
        }

        // O(n^2)
        private static void QuickSort(int[] array, int low, int high)
        {
            if (low < high)
            {
                int pivot = Partition(array, low, high);

                QuickSort(array, low, pivot - 1);
                QuickSort(array, pivot + 1, high);
            }
        }

        private static int Partition(int[] array, int low, int high)
        {
            int pivot = array[high];
            int pivotIndex = low;

            for (int j = low; j < high; j++)
            {
                if (array[j] < pivot)
                {
                    Swap(array, pivotIndex, j);
                    pivotIndex++;
                }
            }

            Swap(array, pivotIndex, high);
            return pivotIndex;
        }

        private static void Swap(int[] array, int a, int b)
        {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }

        private static void DisplayArray(int[] array)
        {
            foreach (int num in array)
                Console.Write($"{num} ");
        }
    }
}
