// import java.util.Arrays;
// import java.util.concurrent.*;

// public class ParallelMergeSort {
//     public static void parallelMergeSort(int[] arr, int threadCount) {
//         ExecutorService executor = Executors.newFixedThreadPool(threadCount);
//         parallelMergeSort(arr, 0, arr.length - 1, executor);
//         executor.shutdown();
//     }

//     private static void parallelMergeSort(int[] arr, int low, int high, ExecutorService executor) {
//         if (low < high) {
//             int mid = (low + high) / 2;

//             Future<?> leftTask = executor.submit(() -> parallelMergeSort(arr, low, mid, executor));
//             Future<?> rightTask = executor.submit(() -> parallelMergeSort(arr, mid + 1, high, executor));

//             try {
//                 leftTask.get();
//                 rightTask.get();
//             } catch (InterruptedException | ExecutionException e) {
//                 e.printStackTrace();
//             }

//             merge(arr, low, mid, high);
//         }
//     }

//     private static void merge(int[] arr, int low, int mid, int high) {
//         int[] temp = new int[high - low + 1];
//         int left = low;
//         int right = mid + 1;
//         int k = 0;

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp[k++] = arr[left++];
//             } else {
//                 temp[k++] = arr[right++];
//             }
//         }

//         while (left <= mid) {
//             temp[k++] = arr[left++];
//         }

//         while (right <= high) {
//             temp[k++] = arr[right++];
//         }

//         for (int i = low; i <= high; i++) {
//             arr[i] = temp[i - low];
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {9, 3, 7, 1, 5, 10, 2, 6, 8, 4};
//         int threadCount = 2; // Experiment with different thread counts
        
//         System.out.println("Original array: " + Arrays.toString(arr));
        
//         parallelMergeSort(arr, threadCount);
        
//         System.out.println("Sorted array: " + Arrays.toString(arr));
//     }
// }
