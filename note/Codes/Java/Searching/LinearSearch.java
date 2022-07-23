public class LinearSearch {
	private static int recursiveLinearSearch(int arr[], int index ,int x){
		if(index>=arr.length){return -1;}
		else if(arr[index] == x) {return index;}
		else{return recursiveLinearSearch(arr,index+1,x);}
	}
	private static int searchLinearly(int arr[], int x){
		for (int i = 0; i<arr.length; i++){
			if(arr[i] == x) return i;
		}
		return -1;
	}
	public static void main(String[] args){
		int arr[] = new int[]{25,16,9,72,10,86};
		int searchNumber = 10;
		System.out.println("LinearSearch"+searchLinearly(arr,searchNumber));
		System.out.println("RecursiveLinearSearch"+recursiveLinearSearch(arr,0,searchNumber));
	}
}