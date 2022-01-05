package arrays;

public class Kth_Smallest_Element {

    static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
     static int kthSmallest(int[] arr, int i, int size, int k){
        int pos = partition(arr, i, size);
        if(pos == k-1){
            return arr[pos];
        }
        if(pos > k-1){
            return kthSmallest(arr, i, pos-1, k);
        }
            return kthSmallest(arr, pos+1, size, k);
     }

    public static void main(String[] args) {
        int arr[] =  { 12, 3, 5, 7, 4, 19, 26 };
        int k = 5;
        System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
    }
}
