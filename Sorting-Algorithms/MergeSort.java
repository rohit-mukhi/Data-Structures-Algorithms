public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 67, 98, 44, 76, 68, 21, 84};
        arr = sort(arr, 0, (arr.length-1));
        for(int val : arr) 
            System.out.print(val + " ");
        System.out.println();
    }

    public static int[] sort(int[] arr, int p, int r) {
        if(p >= r) 
            return arr;
        int q = (p+r)/2;
        sort(arr, p, q);
        sort(arr, q+1, r);
        merge(arr, p, q, r);
        return arr;
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int nl = q-p+1;
        int nr = r-q;
        int[] arr1 = new int[nl];
        int[] arr2 = new int[nr];
        for(int i=0; i<nl; i++)
            arr1[i] = arr[p+i];
        for(int j=0; j<nr; j++)
            arr2[j] = arr[q+j+1];
        int i=0, j=0, k=p;
        
        
        while(i<nl && j<nr) {
            if(arr1[i] <= arr2[j]) 
                arr[k] = arr1[i++];
            else    
                arr[k] = arr2[j++];
            k++;
        }

        while(i<nl) {
            arr[k] = arr1[i++];
            k++;
        }

        while(j<nr) {
            arr[k] = arr2[j++];
            k++;
        }

    }
}
