
public class SentenceCharacterReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="My name is khan";
String word[]=str.split(" ");
String rev=" ";
for(int i =0;i<word.length;i++){
	String str1=word[i];
	String rev1=" ";
	for(int j=str1.length()-1;j>=0;j--){
		rev1=rev1+str1.charAt(j);
	}
	rev=rev+rev1+" ";
}
System.out.println(rev);
	}

}
