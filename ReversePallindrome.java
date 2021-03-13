import java.util.Scanner;


public class ReversePallindrome {
public static void checkPallindome(String str,int len){
	char[]a=str.toCharArray();
	String rev="";
	for(int i=len-1;i>=0;i--){
		rev=rev+a[i];
	}
	System.out.println("Revesre of string is :"+rev);
	if(str.equals(rev)){
		System.out.println("The given string is pallindrome");
	}else{
		System.out.println("Given string is not pallindrome");
	}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string :");
	String str=sc.nextLine();
	int len=str.length();
	System.out.println(len);
	checkPallindome(str, len);
}
}
