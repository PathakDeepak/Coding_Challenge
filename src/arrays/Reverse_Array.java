package arrays;

public class Reverse_Array {

    static void printArray(int arr[], int size){
        for (int s = 0; s < size; s++) {
            System.out.print(arr[s] + "\t");
        }
    }
    // Complexity: O(n)
     static void reverseArrayIterative(int arr[], int start, int end){
        int temp;

        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
     }

    // Complexity: O(n)
    static void reverseArrayRecursively(int arr[], int start, int end){
        int temp;

        if(start>=end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayRecursively(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArrayIterative(arr, 0, 5);
        System.out.println("\nAfter reversal");
        printArray(arr, 6);
        reverseArrayRecursively(arr, 0, 5);
        System.out.println("\nAgain recursively reversal");
        printArray(arr, 6);
    }
}
