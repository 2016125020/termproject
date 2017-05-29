import java.util.Random;

public class HangMan {	
	private String[] secret_list = {"apple", "banana", "car"};
    private String secret_word;
    protected int[] star_list;
    protected int banana = 5;
    protected int listsize;
    public HangManHint hint;
    
	public HangMan(){
		secret_word = secret_list[(int) (Math.random()*3)];
	    System.out.printf("\nsecret word : %s", secret_word);
	    listsize = secret_word.length();
	    star_list = new int[secret_word.length()];
	    hint = new HangManHint();
		for(int i=0; i < secret_word.length(); i++){
			star_list[i] = 0;			
		}
	    
	}
	
	public void guessWord(char a){
		boolean isthere = false;
		for(int i=0; i < secret_word.length(); i++){
			if(secret_word.charAt(i) == a){
				star_list[i] = 1;
				isthere = true;
			}
		}
		if(isthere == false){
			banana = banana - 1;
		}
	}
	
	public boolean guessWord(String a){
		if(secret_word.equals(a)){
			return true;
		}else{
			banana = banana - 1;
			return false;
		}
	}
	public void print_starlist(){
		for(int i=0; i < secret_word.length(); i++){
			if(star_list[i]==0){
				System.out.print("*");
			}else{
				System.out.print(secret_word.charAt(i));
			}
		}
		System.out.print("\n");
	}
	
	public int getbanana(){
		return banana;
	}
	
	public boolean isfinish(){
		for(int i=0; i < secret_word.length(); i++){
			if(star_list[i] == 0){
				return false;
			}
		}
		return true;
	}
}
