// Selection Sort :
//     Basic goal is to repeatedly find the minimum element and putting it at the beginning. 

public class SelecttionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
