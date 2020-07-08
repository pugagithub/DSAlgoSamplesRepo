package july2020;


// word = PUGAL
public class AnagramJuly2020 {
	
	static String word = "ABC";

	static void anagram(String context , String tempWord){
		
		//System.out.println("Buffer : "+ buffer);
		//System.out.println("tempWord : "+ tempWord);
		if(tempWord.length()==0) {
			System.out.println(context+tempWord);
			return ;
		}
		
		for(int i=0;i<tempWord.length();i++) {
			
			 
			 anagram(context+(tempWord.charAt(i)+"") , tempWord.substring(0,i)+tempWord.substring(i+1));
			
		}
	}
	
	public static void main(String[] args) {
		anagram("", word);
	}
}
