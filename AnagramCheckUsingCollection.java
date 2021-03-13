import java.util.Arrays;


public class AnagramCheckUsingCollection {
public static void checkAnagram(String str1,String str2){
	String str11=str1.replace(" ", "");
	String strl2=str2.replaceAll(" ", "");
	boolean status=true;
	if(str11.length()!=strl2.length()){
		status=false;
	}else{
		char[]a1=str11.toLowerCase().toCharArray();
		char[]a2=strl2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		status=Arrays.equals(a1, a2);
	}
	if(status){
		System.out.println(str11+"   and   "+strl2+"are anagram");
	}else{
		System.out.println(str11+" " +strl2 + "Not anagram");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAnagram("Mother In Law", "Hitler Woman");  
		checkAnagram("peek", "peek");  
	}

}
