import java.util.*;



public class ShellSort {
    public static void shellsort(int arr[]) {
        int n = arr.length;
        int gap = n / 2;
        int temp, i, j;
        for (gap = n / 2; gap > 0; gap = gap / 2) {
            for (i = gap; i < n; i++) {
                temp = arr[i];
                for (j = i; j >= gap && arr[j - gap] > temp; j = j - gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array!");
        int n = sc.nextInt();
        System.out.println("enter the element of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        shellsort(arr);
        System.out.println("after sorting array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
