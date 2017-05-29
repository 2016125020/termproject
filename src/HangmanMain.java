import java.lang.String;
import java.util.Scanner;

public class HangmanMain {
	public static void main(String args[]){
		HangMan word = new HangMan();
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("\n1. 한글자 맞추기  2. 단어맞추기 ");
			int choice = input.nextInt();
			if(choice == 1){
				System.out.print("궁금한 글자를 입력하세요 : ");
				char letter = input.next().charAt(0);
				
				word.guessWord(letter);
				
			}else if(choice == 2){
				System.out.print("단어를 입력하세요 : ");
				String isword = input.next();
				
				if(word.guessWord(isword)){
					System.out.println("게임을 이기셨어요!");
					break;
				}else{
					System.out.println("틀리셨네요! 바나나를 가져갑니다.");
				}
				
			}
			word.print_starlist();
			
			if(word.getbanana() == 0){
				System.out.println("바나나가 없어요! 졌습니다.");
				break;
			}else{
				System.out.printf("현재 바나나의 개수는 %d개 입니다.\n", word.getbanana());
			}
			
			if(word.isfinish()){
				System.out.println("게임을 이기셨어요!");
				break;
			}			
		}
	}
}

