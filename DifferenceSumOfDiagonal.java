
public class DifferenceSumOfDiagonal {
	public static void findDiff(int a1[][]){
		int d1=0,d2=0,diff=0;
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1.length;j++){
				if(i==j){
					
					d1=d1+a1[i][j];
				}else if(i==a1.length-i-j){
					d2=d2+a1[i][j];
				}
			}
				
		}
		diff=d1-d2;
		System.out.println(diff);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]={{11,2,4},{10,2,5},{10,5,9}};
findDiff(a);
	}

}
