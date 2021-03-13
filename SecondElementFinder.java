
public class SecondElementFinder {

	public static void pritnSecond(int arr[],int size){
		if(size<2){
			System.out.println("Invalid Input");
			return;
		}
		int first,second;
		first=second=Integer.MIN_VALUE;
		for(int i=0;i<size;i++){
			if(arr[i]>first){
				
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first){
				second=arr[i];
			}
		}
		if(second==Integer.MIN_VALUE){
			System.out.println("There is no second element");
		}
		else{
			System.out.println("Second element is "+second);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={12,35,14};
int n=arr.length;
pritnSecond(arr, n);
	}

}
