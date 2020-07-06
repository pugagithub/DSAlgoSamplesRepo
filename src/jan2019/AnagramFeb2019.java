package jan2019;

public class AnagramFeb2019 {
	
	static String word = "ABCDE";
	
	public static void main(String[] args) {
		doAnagram("",word);
	}
	
	static void doAnagram(String prefix , String word){
		
		if(word.length()==0)System.out.println(prefix);
		
		for(int i=0;i<word.length();i++){
			doAnagram(prefix + word.charAt(i), word.substring(0,i)+word.substring(i+1,word.length()));
		}
	}

}
