public class BinarySearch{
	public static void main(String [] args){
		int arr [] = new int[]{10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,};
		System.out.println(binarySearch(arr,56));
		System.out.println(recursiveBinarySearch(arr,55,0,arr.length-1));
	}
	private static int recursiveBinarySearch(int arr[], int x, int p, int r){
		int q = (p+r)/2;
		if(p>r){return -1;}
		else if(x>arr[q]) {return recursiveBinarySearch(arr,x,q+1,r);}
		else if(x<arr[q]) {return recursiveBinarySearch(arr,x,p,q-1);}
		else return q;
	}
	public static int binarySearch(int arr[], int x){
		int p = 0;
		int r = arr.length-1;
		while(p<=r){
			int q = (p+r)/2;
			if(x<arr[q]){r=q-1;}
			else if(x>arr[q]){p=q+1;}
			else return q;
		}
		return -1;
	}
}