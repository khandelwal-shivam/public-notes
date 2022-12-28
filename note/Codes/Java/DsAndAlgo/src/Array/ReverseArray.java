package Array;

public class ReverseArray {
    public static void printArray(int[] arr) {
        for(int i= 0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 5, 10, 7, 8, 9};
        reverse(numbers);
        printArray(numbers);
    }
}
