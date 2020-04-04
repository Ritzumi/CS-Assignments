import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AllSort {

    public static void main(String[] args) {
        int[] data = {30, 5, 60, 11, 4, 200, 99, 6, 81, 3};
        int[] b = {30, 5555, 460, 1111, 4, 200, 99, 606, 3781, 3, 1167, 543, 22, 5632, 876};
        // MergeSort(data, 0, data.length - 1);
        RadixSort(b);
        System.out.println(Arrays.toString(b));
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int least = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            // swap betwwen least and i
            if (i != least) {
                int temp = arr[i];
                arr[i] = arr[least];
                arr[least] = temp;
            }
        }
    }

    public static void InsertionSort(int[] data) {
        int i, j;
        for (i = 1; i < data.length; i++) {
            int temp = data[i];
            // int[] data = { 30, 5, 60, 11, 4, 200, 99, 6, 81, 3 };
            for (j = i - 1; j >= 0 && temp < data[j]; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }
    }

    public static void BubbleSort_TopDown(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void BubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    public static void QuickSort(int[] data, int first, int last) {
        if (first >= last)
            return;
        int lower = first + 1, upper = last;
        int pivot = first;
        while (lower <= upper) {
            while (data[lower] < data[pivot] && lower < data.length) {
                lower++;
            }
            while (data[upper] > data[pivot] && upper >= 0) {
                upper--;
            }
            if (lower < upper) {
                Swap(data, lower, upper);
                lower++;
                upper--;
            } else {
                lower++;
            }
        }
        Swap(data, pivot, upper);
        QuickSort(data, first, upper - 1);
        QuickSort(data, upper + 1, last);
    }

    public static void Swap(int[] data, int index1, int index2) {
        if (data.length <= 1) {
        } else {
            int temp = data[index1];
            data[index1] = data[index2];
            data[index2] = temp;
        }
    }

    public static void MergeSort(int[] data, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            MergeSort(data, first, mid);
            MergeSort(data, mid + 1, last);
            merge(data, first, last);
        } else {

        }
    }

    public static void merge(int[] data, int first, int last) {
        int[] result = new int[last - first + 1];
        int mid = (first + last) / 2;
        int left = first, right = mid + 1;
        int i = 0;
        while (left <= mid && right <= last) {
            if (data[left] < data[right]) {
                result[i] = data[left];
                left++;
            } else {
                result[i] = data[right];
                right++;
            }
            i++;
        }
        while (left <= mid) {
            result[i] = data[left];
            left++;
            i++;
        }
        while (right <= last) {
            result[i] = data[right];
            right++;
            i++;
        }
        for (int j = 0; j <= last - first; j++) {
            data[first + j] = result[j];
        }
    }

    public static void RadixSort(int[] data) {
        Queue<Integer>[] pile = new Queue[10];
        for (int i = 0; i < 10; i++) {
            pile[i] = new LinkedList<>();
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        int digits = 0;
        while (max > 0) {
            max /= 10;
            digits++;
        }
        int radix = 1, factor = 10;
        for (int i = 0; i < digits; i++) {
            for (int j = 0; j < data.length; j++) {
                int pileNumber = (data[j] / radix) % 10;
                pile[pileNumber].add(data[j]);
            }
            int index = 0;
            for (int pileNumber = 0; pileNumber < 10; pileNumber++) {
                while (!pile[pileNumber].isEmpty()){
                    data[index]  = pile[pileNumber].poll();
                    index++;
                }
            }
            radix *= factor;
        }


    }

}