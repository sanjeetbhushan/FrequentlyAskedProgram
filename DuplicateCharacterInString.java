import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateCharacterInString {
public static void findDupli(String str){
	Map<Character,Integer> charmap=new HashMap<Character,Integer>();
	char[]a=str.toCharArray();
	for(Character ch:a){
		if(charmap.containsKey(ch)){
			charmap.put(ch, charmap.get(ch)+1);
		}else{
			charmap.put(ch,1);
		}
		
	}
	System.out.println(charmap);
	Set<Character>key=charmap.keySet();
	for(Character ch:key){
		if(charmap.get(ch)>1){
			System.out.println(ch+"    "+charmap.get(ch));
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
findDupli("techmahindra");
	}

}
