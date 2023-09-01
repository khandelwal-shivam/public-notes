import java.util.Arrays;

public class CodilitySolutions {
    public static void main(String[] args){

//        int number = 1041;
//        final int[] length = {0};
//        String converted_Binary_Form = Integer.toString(number,2); // Integer.toBinaryString
//        System.out.println(converted_Binary_Form);
//        Arrays.stream(converted_Binary_Form.split("1")).forEach(arr -> {
//            if(arr.length() > length[0]) {
//                length[0] = arr.length();
//            }
//        });
//        System.out.println("length " +length[0]);
        int arr[] = {10,20,30,40,50};
        int numOfRotations = 2;
        for(int i = 0; i <numOfRotations; i++) {
            int last = arr[arr.length-1];
            int next = arr[1];
            for(int j = 0; j<arr.length-1; j++) {


            }
            arr[0] = last;
        }
        Arrays.stream(arr).forEach(a->System.out.println(a));
    }
}
