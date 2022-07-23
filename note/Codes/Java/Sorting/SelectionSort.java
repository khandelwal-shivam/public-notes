 /*Selection Sort. 
	Best Case :- Ω(n^2)
	Worst Case :- O(n^2)
	Avg Case :- θ(n^2) */
	
/*
	Logic :- Select the smallest element and place it at 0 index, now select next smallest and place it at index 1....& so on.
*/
public class SelectionSort{
	public static void main(String [] args){
		int arr[] = new int[] {9,4,1,2,5,7,6,3,8};
		int arr1[] = sort(arr);
		for(int i = 0;i<arr1.length;i++)System.out.println(arr1[i]);
		
	}
	private static int[] sort(int arr[]){
		for(int i = 0;i<arr.length; i++){
			int min_index = i;
			for(int j = i+1; j < arr.length; j++ ){
				if(arr[j]<arr[min_index]){
					min_index = j;
				}
			}
			int num1 = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] =  num1;
		}
		return arr;
	}
}