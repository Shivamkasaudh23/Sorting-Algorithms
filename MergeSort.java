class MergeSort{
    public static void main (String args[]) {
         int arr[] = {3,5,9,7,4,2,1};
         for(int a : arr){
            System.out.println(a);
         }
         System.out.println(" ");
         sort(arr,0,arr.length-1);
         for(int a : arr){
            System.out.println(a);
         }
    }
    static void sort(int arr[], int l, int r){

        if(l<r){
            int m = l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }
    static void merge(int arr[], int l, int m, int r){
        int merged[] = new int[r-l+1];


        int idx1=l, idx2=m+1;
        int x = 0;

        while(idx1 <= m && idx2 <= r){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }

        // Copying remaining elements in l1[] if any
        while(idx1<=m){
            merged[x++] = arr[idx1++];
        }

        // Copying remaining elements in l2[] if any
        while(idx2<=r){
            merged[x++] = arr[idx2++];
        }


        for(int i=0, j=l; i<merged.length; i++, j++ ){
            arr[j] = merged[i];
        }
    }
}