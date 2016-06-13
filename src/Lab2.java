import java.util.Scanner;

public class Lab2{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name;
		String quest="";
		String answer;
		String color;
		String answer1;
		String f;
		String g;
		
			System.out.println("Welcome to the game of games! You think youre a nerd? Lets find out. King Arthur is traveling through the wilderness, seeking the Holy Grail to complete his devine quest.");
			System.out.println("Accompanied by three knights: Sir Galahad the Pure, Sir Lancelot the Brave and Sir Robin the Not-Quite-So-Brave-as-Sir Launcelot.");
			System.out.println("To win, answer correctly the trecherous bridgekeepers questions. Beware of his trickery!");
			System.out.println("Would you like to play? Y or N");
			String a = in.nextLine();
			
			while (a.equalsIgnoreCase("y")) {
				System.out.println("Bridgekeeper: Stop. Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
				System.out.println("Bridgekeeper: What...is your name?");
				System.out.println("A. Kobe B. Sir Galahad the Pure C. Sir Lancelot the Brave");
				name = in.nextLine();
				if (name.equalsIgnoreCase("C")) {
					System.out.println("My name is Sir Lancelot of Camelot.");
					System.out.println("Bridgekeeper: What...is your quest? ");
					System.out.println("A. I want to pass gas B. I seek the money from your walet now! C. I seek the Holy Grail.");
					quest = in.nextLine();
					//sQUEST
					if (!quest.toLowerCase().contains("c")) {
						System.out.println("AAAHHHHHH!");
						System.out.println("You fell off the bridge and died a terrible death.");
					} 
					else {
						System.out.println("Bridgekeeper: What...is your favorite color?");
						color = in.nextLine();
						if (color.equalsIgnoreCase("Blue")) {
							System.out.println("Bridgekeeper: Go on. Off you go.");
							System.out.println(" Sir Lancelot: Oh, thank you. Thank you very much. \n Sir Robin: That's easy. ");
						} 
						else if (!color.equalsIgnoreCase("Blue")) {
							System.out.println("AAAHHHHHH!");
							System.out.println("You fell off the bridge and died a terrible death.");
						}
					}
				} else if (name.equalsIgnoreCase("B")) {
					System.out.println("AAAHHHHHH!");
					System.out.println("You fell off the bridge and died a terrible death.");
				} else if (name.equalsIgnoreCase("A")) {
					System.out.println("AAAHHHHHH!");
					System.out.println("You fell off the bridge and died a terrible death.");
				} 
				System.out.println("Do you want to restart? Y or N");
				a = in.nextLine();
			}
			System.out.println("Game Over!");
			//end of game
			in.close();
	} //end of main
}
			
			
			
			
			/*dragon:
				while(a.equalsIgnoreCase("Y")) {
				
				String name;
				String quest="";
				String answer;
				String color;
				String answer1;
				String f;
				String g;
				
				
				System.out.println("Bridgekeeper: Stop. Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
				System.out.println("Bridgekeeper: What...is your name?");
				System.out.println("A. Kobe B. Sir Galahad the Pure C. Sir Lancelot the Brave");
				name = in.nextLine();
				
				if(name.equalsIgnoreCase("C")) {
					System.out.println("My name is Sir Lancelot of Camelot.");
					System.out.println("Bridgekeeper: What...is your quest? ");
					quest = in.nextLine();
				}
					
				if(!quest.contains("Holy Grail")) {
					System.out.println("AAAHHHHHH!");
					System.out.println("You fell off the bridge and died a terrible death.");
					System.out.println("Do you want to restart? Y or N");
					answer = in.nextLine();
						if(answer.equalsIgnoreCase("Y")) {
							System.out.println("To seek the Holy Grail.");
							break dragon;
						}
						else;
						break;
				}
				else;
					System.out.println("Bridgekeeper: What...is your favorite color?");
					color = in.nextLine();
					if(color.equalsIgnoreCase("Blue")) {
						System.out.println("");
						System.out.println("Bridgekeeper: Go on. Off you go.");
					}
						else;
							System.out.println("AAAHHHHHH!");
							System.out.println("You died a terrible death.");
							System.out.println("Do you want to restart? Y or N");
							answer1 = in.nextLine();
							if(answer1.equalsIgnoreCase("Y")) {
								break dragon;
							}
							else;
							break;
							*/
	
			
			
			
			
	
	
