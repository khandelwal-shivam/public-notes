/*
	Best Case :- Ω(n log(n))
	Worst Case :- O(n log(n))
	Avg Case :- θ(n log(n))
*/
/*It has higher space complexities because of Left and Right array*/
/*Merge Sort is a Divide and Conquer algorithm. */
public class MergeSort{
	int arr[];
	public MergeSort(){
		arr = new int[]{9,4,1,2,5,7,6,8,3,0};
	}
	public static void main(String [] args){
		MergeSort ms = new MergeSort();
		ms.sort(ms.arr,0,ms.arr.length-1);
		for(int i =0; i<ms.arr.length;i++)System.out.println(ms.arr[i]);
	}
	private void sort(int arr[], int left,int right){
		if(left<right){
			int middle = left+(right-left)/2;
			sort(arr,left,middle);
			sort(arr,middle+1,right);
			merge(arr,left,middle,right);
		}
	}
	private void merge(int arr[], int left, int middle, int right){
		int numInLeftArray = middle-left+1;
		int numInRightArray = right-middle;
		int leftArray[] = new int[numInLeftArray];
		int rightArray[] = new int[numInRightArray];
		for(int i = 0;i < numInLeftArray; i++){leftArray[i] = arr[left+i];}
		for(int j = 0;j < numInRightArray; j++){rightArray[j] = arr[middle+j+1];}
		int i=0,j=0, k= left;
		while(i<numInLeftArray && j<numInRightArray){
			if(leftArray[i]<rightArray[j]){
				arr[k]=leftArray[i];
				i++;
			}else{
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<numInLeftArray){
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<numInRightArray){
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
}