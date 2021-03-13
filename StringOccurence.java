
public class StringOccurence {
public static void main(String[] args) {
	String str="sanjeetbhushanz";
	int count=1;
	char[]a=str.toCharArray();
	for(int i=0;i<str.length();i++){
		
		for(int j=i+1;j<str.length();j++){
			if(a[i]==a[j]){
				count++;
				System.out.println(a[i]+""+count);
				break;
			}
		}
	}
}
}
