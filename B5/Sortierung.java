public class Sortierung {
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        // FIX: split declaration?
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[array.length - mid];

        // Copy elements to left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort the left and right subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted left and right subarrays
        merge(left, right, array);
    }

    private static <T extends Comparable<T>> void merge(T[] left, T[] right, T[] array) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right subarrays and merge them in sorted order
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left subarray, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right subarray, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static <T extends Comparable<T>> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}