
public class SentenceWordReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="My name is khan";
String word[]=str.split(" ");
String output=" ";
for(int i=word.length-1;i>=0;i--){
	output=output+word[i]+" ";
}
System.out.println(output);

	}

}
