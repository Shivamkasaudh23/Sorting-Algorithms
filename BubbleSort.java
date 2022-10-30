public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 9, 7, 4, 2, 1 };
        for (int a : arr) {
            System.out.print(a + " ");
        }
        int n = arr.length;
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
