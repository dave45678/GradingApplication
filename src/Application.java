import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your test score: ");
		int score = keyboard.nextInt();
		keyboard.nextLine();
		
		char grade = ' ';
		char plus = ' ';

		if (score > 89){
		    grade = 'A';
		}else if (score > 79){
		    grade = 'B';
		}else if (score > 69){
		    grade = 'C';
		}else if (score > 59){
			grade = 'D';
		}else{ 
		    grade = 'F';
		}
		
		//add plus or minus for all non-failing grades
		if (score > 59) {
			if (score % 10 >= 0 && score % 10 <= 2) {
				plus = '-';
			} else if (score % 10 >= 7 && score % 10 <= 9) {
				plus = '+';
			}else{
				plus = ' ';
			}
		}
		
		//Output
		System.out.printf("You will get a %s%s\n", grade, plus);
		keyboard.close();
	}

}