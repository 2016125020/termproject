import java.util.Random;

public class HangManHint extends HangMan {
	private int hint_count=1;
	private int hint_num;
	
	public void HangManHint(){
		hint_num = (int)Math.random()*3;
	}
	
	public int getHintCount(){
		return hint_count;
	}
	
	public void useHint(){
		if(hint_num == 1){
			hintaddBanana();
		}else if(hint_num == 2){
			hintshowletter();
		}
	}
	
	public void hintaddBanana(){
		banana = banana + 1;
	}
	
	public int hintshowletter(){
		while(true){
			int a = (int)Math.random()*listsize;			
			if(star_list[a] == 0){
				star_list[a] = 1;
				return 1;
			}else{
				continue;
			}
		}
	}
	
}
