/*
	Best Case :- Ω(n)
	Worst Case :- O(n^2)
	Avg. Case :- θ(n^2)
*/
public class BubbleSort{
	public static void main(String[] args){
		int arr[] = new int[]{9,4,1,2,5,7,6,8,3,0};
		
		for(int i = 0; i<arr.length-1;i++){
			boolean swapped = false;
			for(int j = 0; j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false){break;}
		}
		for(int k = 0;k<arr.length;k++){System.out.println(arr[k]);}
	}
}