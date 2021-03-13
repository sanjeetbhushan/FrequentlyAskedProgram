
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="sanjeet";
String rev=" ";
int  len=s.length();
char ch[]=s.toCharArray();
for(int i=len-1;i>=0;i--){
	rev=rev+ch[i];
}
System.out.println(rev);
	}

}
