
public class CountVowelConsonat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel=0,consonant=0,digit=0,spaces=0;
		String str="The whole thing is that aam 2 8ani kharcha rupaiya";
		str=str.toLowerCase();
		for(int i =0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				++vowel;
			}
			else if(ch>='a'&&ch<='z'){
				++consonant;
			}
			else if (ch>='0'&&ch<='9') {
				++digit;
			}else if (ch==' ') {
				++spaces;
			}
		}
		System.out.println("Vowel is "+vowel);
		System.out.println("Consonant is :"+consonant);
		System.out.println("Digit is :"+digit);
		System.out.println("Spaces is :"+spaces);
	}

}
