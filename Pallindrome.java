
public class Pallindrome {

	public static void main(String[] args) {
	String s="MOM and dad are god";
	String rev="";
	String words="";
	String[] a =s.split(" ");
	for(int i=0;i<a.length;i++){
		words=a[i];
		rev=words;
		String reverseword="";
		for(int j=words.length()-1;j>=0;j--){
			
			 reverseword=reverseword+words.charAt(j);
		}
		if(reverseword.equalsIgnoreCase(rev)){
			System.out.println(reverseword+" is pallindrome");
		}
		
	}
}
}