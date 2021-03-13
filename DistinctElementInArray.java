
public class DistinctElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,9,8,9,7,6,10,6,8,2,21};
		int count=0;
		for(int i=0;i<arr.length;i++){
			int j;
			for(j=0;j<i;j++){
				if(arr[i]==arr[j]){
					
					break;
				}
				
			}
			if(i==j){
				System.out.println(arr[i]);
			}
				
		}
	}

}
