import java.lang.String;
import java.util.Scanner;

public class HangmanMain {
	public static void main(String args[]){
		HangMan word = new HangMan();
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("\n1. �ѱ��� ���߱�  2. �ܾ���߱� ");
			int choice = input.nextInt();
			if(choice == 1){
				System.out.print("�ñ��� ���ڸ� �Է��ϼ��� : ");
				char letter = input.next().charAt(0);
				
				word.guessWord(letter);
				
			}else if(choice == 2){
				System.out.print("�ܾ �Է��ϼ��� : ");
				String isword = input.next();
				
				if(word.guessWord(isword)){
					System.out.println("������ �̱�̾��!");
					break;
				}else{
					System.out.println("Ʋ���̳׿�! �ٳ����� �������ϴ�.");
				}
				
			}
			word.print_starlist();
			
			if(word.getbanana() == 0){
				System.out.println("�ٳ����� �����! �����ϴ�.");
				break;
			}else{
				System.out.printf("���� �ٳ����� ������ %d�� �Դϴ�.\n", word.getbanana());
			}
			
			if(word.isfinish()){
				System.out.println("������ �̱�̾��!");
				break;
			}			
		}
	}
}

