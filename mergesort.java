import java.util.*;

// not working properly please check it again sir!

class mergesort {
    public static void merge(int arr[], int l, int mid, int r) {
        int i, j, k;
        int n1 = mid - r + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (i = 0; i < n1; i++) {
            left[i] = arr[i];

        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + j + 1];

        }
        i = 0;
        j = 0;
        k = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int arr[], int l, int r) {
        int mid;
        if (l < r) {
            mid = (l + r) / 2;
            mergeSort(arr, 0, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the element of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        mergeSort(arr, l, r);
        System.out.println("after sorting array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}