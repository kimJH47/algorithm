package programmers.heap;

import java.util.stream.IntStream;

public class DiskController {

    public int solution(int[][] jobs) {
        int answer = 0;

        int[] heap = new int[jobs.length];
        for (int i = 0; i < heap.length; i++) {
            heap[i] = i;
        }
        heapSort(heap, jobs);
        int[] ints = IntStream.range(0, 10)
                .filter(value -> value % 2 != 0)
                .toArray();
        return answer;
    }

    private void heapSort(int[] arr, int[][] jobs) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, jobs);
        }

        // Heap sort
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0, jobs);
        }
    }

    private void heapify(int[] arr, int n, int i, int[][] jobs) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n) {
            largest = test(left, largest, jobs);
        }

        // If right child is larger than largest so far
        if (right < n) {
            largest = test(right, largest, jobs);
        }
        ;

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest, jobs);
        }
    }

    private int test(int a, int b, int[][] jobs) {
        if (testCase(a, b, jobs) < testCase(b, a, jobs)) {
            return a;
        }
        return b;
    }

    private int testCase(int a, int b, int[][] jobs) {
        int jobA = jobs[a][1];
        int jobB = jobA + 1 - jobs[b][0] + jobs[b][1];
        return jobA + jobB;
    }

    public static void main(String[] args) {
        DiskController diskController = new DiskController();
        diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});

    }

}
