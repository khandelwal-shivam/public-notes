package Array;

public class SecondMaxInArray {

    public static int findSecondMax(int[] arr) {
        int max;
        int secondMax;
        if(arr[0]>arr[1]){
            max = arr[0];
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }
        for(int i = 2;i<arr.length;i++) {
            if(arr[i]>max ){
                secondMax = max;
                max = arr[i];
            } else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        int[] arr = {13, 34, 2, 34, 33,1 };
        System.out.println(findSecondMax(arr));
    }
}
