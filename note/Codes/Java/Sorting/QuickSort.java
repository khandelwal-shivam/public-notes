/*
	Best Case :- Ω(n log(n))
	Worst Case :- O(n^2)
	Avg Case :- θ(n log(n))
*/
public class QuickSort {
	int [] arr;
	public QuickSort(){
		arr = new int[]{10, 80, 30, 90, 40, 50, 70};
	}
	public static void main(String[] args){
		QuickSort qs = new QuickSort();
		qs.sort(qs.arr,0,qs.arr.length-1);
		for(int k= 0;k<qs.arr.length;k++){
			System.out.println(qs.arr[k]);
		}	
		
	}
	private void sort(int [] arr, int leftMostIndex, int rightMostIndex){
		if(leftMostIndex<rightMostIndex) {
			int pivotIndex = partition(arr,leftMostIndex,rightMostIndex);
			sort(arr,leftMostIndex,pivotIndex-1);
			sort(arr,pivotIndex+1,rightMostIndex);
		}
	}
	private int partition(int []arr, int leftMostIndex, int rightMostIndex){
		int i = leftMostIndex-1;
		int pivot = arr[rightMostIndex];
		for(int j = leftMostIndex;j<rightMostIndex;j++){
			if(pivot>arr[j]){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,rightMostIndex);
		return i+1;
	}
	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}