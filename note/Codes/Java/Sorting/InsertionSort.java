/*Insertion Sort
	Best Case :- Ω(n)
	Worst Case :- O(n^2)
	Avg Case :- θ(n^2) */
public class InsertionSort{
	int arr[] ;
	InsertionSort(){
		arr = new int[] {8,9,4,1,2,5,7,6,0,3};
	}
	public static void main(String [] args){
		InsertionSort s = new InsertionSort();
		int []arr1 = s.sort();
		for(int i = 0;i<arr1.length;i++)System.out.println(arr1[i]);
	}
	public int[] sort(){
		for(int i =1; i<arr.length;i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}