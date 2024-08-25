class QuickSort {

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int i = low;
            int j = high;
            int pivot = arr[low];

            while (i < j) {
                while (i < j && arr[j] >= pivot) {
                    j--;
                }
                while (i < j && arr[i] <= pivot) {
                    i++;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            arr[low] = arr[j];
            arr[j] = pivot;

            sort(arr, low, j - 1);
            sort(arr, j + 1, high);
        }
    }

    public void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Quick Sorting\n");
        int[] arr = {1, 3, 5, 0, 2, 1};
        QuickSort QS = new QuickSort();
        QS.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:\n");
        QS.display(arr);
    }
}
