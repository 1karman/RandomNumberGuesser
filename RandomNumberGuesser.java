
import java.util.Scanner;

public class RandomNumberGuesser {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RNG random = new RNG();
		Scanner input = new  Scanner(System.in);
		int lowGuess=0, highGuess=100;
		RNG.resetCount();
		int randNum;
		int nextGuess;
		int i=1;
		boolean bool=true;
		boolean answer=true;
		while(true) {
			
			
			highGuess=100;
			lowGuess = 0;
			RNG.rand();
			randNum = RNG.rand();
			
			

			while(true) {
				
			if(i==1) {
				System.out.println("Enter first guess: ");
			}
			else {
				if(answer) {
				System.out.println("Enter next guess between "+lowGuess+" and "+highGuess);
				}
			}
			

			nextGuess = input.nextInt();
				
			if(RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
			

			
			
				System.out.println("Number of guesses is "+i);
			if(nextGuess>randNum || nextGuess<randNum) {
				if(nextGuess<randNum)
				{
					System.out.println("Your guess is too low");  
					lowGuess=nextGuess;
				}
				else {
				
					System.out.println("Your guess is too high");
					highGuess=nextGuess;
				}
				}
				
				else {
					System.out.println("Congrats, you guessed correctly! Would you like to play try again? (y/n) ");
					Scanner in = new Scanner(System.in); 
				    char ans = in.next().charAt(0);
					if(ans=='n'||ans=='N') {
						
						answer=false;
						System.out.println("Thanks for playing!");

					}
					else if(ans=='y'||ans=='Y')  {
						answer=true;
						i=1;
						
						break;

					}
					
					

				}
				}
			
			
			i++;
			}
			
			}
			

			
		}
		
		}
		

		

		
	
	


	

