
public class AnagramCheckWithoutCollection {
	public static boolean checkAnagram(String str1,String str2){
		str1=str1.replaceAll(" ", "").toLowerCase();
		str2=str2.replaceAll(" ", "").toLowerCase();
		if(str1.length()!=str2.length()){
			return false;
		}else{
			for(int i=0;i<str1.length();i++){
				//Iterate each character of the String s1 with String s2, 
				//if a match is found then remove the particular character from s2 using substring() method
				for(int j=0;j<str2.length();j++){
					if(str1.charAt(i)==str2.charAt(j)){
					str2=str2.substring(0, j)+str2.substring(j+1);
					System.out.println(str2);
					break;
					}
				}
			}
			if(str2.length()==0){
				return true;
			}
			else{
				return false;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

if(checkAnagram("peek", "keep")){
	System.out.println("Anagram");
}else
{System.out.println("Not Anagram");
	
}
	}

}
