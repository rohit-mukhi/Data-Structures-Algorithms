// This code is for insertion sort

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = { 23, 69, 36, 51, 11 };
        arr = sort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
// Insertion sort begins here
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
