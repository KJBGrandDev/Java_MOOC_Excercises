import java.util.*;

public class MergeSort {

    // List to store inversion pairs
    private static List<String> inversionPairs = new ArrayList<>();

    // Merge function to merge two halves and count inversions
    private static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;     // Starting index of left subarray
        int j = mid + 1;  // Starting index of right subarray
        int k = left;     // Starting index of temp array
        long invCount = 0;

        // Merge the two halves while counting inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // All remaining elements in left subarray are greater

                // Store each inversion pair
                for (int x = i; x <= mid; x++) {
                    inversionPairs.add("(" + arr[x] + ", " + arr[j - 1] + ")");
                }
            }
        }

        // Copy remaining elements of left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back into original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    // Recursive merge sort function that counts inversions
    private static long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        long invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left subarray
            invCount += mergeSortAndCount(arr, temp, left, mid);

            // Count inversions in right subarray
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

            // Count split inversions
            invCount += mergeAndCount(arr, temp, left, mid, right);
        }
        return invCount;
    }

    // Wrapper function
    public static long countInversions(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSortAndCount(arr, temp, 0, n - 1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for array size
        System.out.print("Give me the size of the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];

        // Step 2: Ask user for array elements
        System.out.println("Now enter " + N + " integers for the array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Step 3: Process inversions
        long result = countInversions(A);

        // Step 4: Show results
        System.out.println("\nTotal number of inversions: " + result);
        System.out.println("These are the inversions (pairs where A[i] > A[j] and i < j):");

        for (String pair : inversionPairs) {
            System.out.println(pair);
        }

        sc.close();
    }
}
