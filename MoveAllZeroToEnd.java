
public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,1,0,4,1,0,9,6,0};
		int count=0;
		int len=a.length;
		for(int i=0;i<len;i++){
			if(a[i]!=0){
				a[count++]=a[i];
			}
		}
while(count<len){
	a[count++]=0;
}
for(int j=0;j<len;j++){
	System.out.print(a[j]);
}
	}

}
