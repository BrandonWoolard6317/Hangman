import java.util.Scanner;
import java.util.Random;

public class Woolard_Hangman {
    public static void main(String[] args) {
        /*System.out.println(" ______________________________");
        System.out.println("|               |              |");
        System.out.println("|               |              |");
        System.out.println("|               O              |");
        System.out.println("|              /|\\             |");
        System.out.println("|            _/ | \\_           |");
        System.out.println("|              / \\             |");
        System.out.println("|           __/   \\__          |");
        System.out.println("|                              |");
        System.out.println(" ______________________________");
        System.out.println("|                              |");
        System.out.println("|     Attempts Left: 0         |");
        System.out.println(" ______________________________");*/

        //Variables
        Scanner usersInput = new Scanner(System.in);
        String usersResponse;
        String Player1;
        String Player2;
        String playerWord;
        int usersResponseNumber;
        int Generator;
        String[] Noob;
        String[] Average;
        String[] Legendary;
        Random Hangman = new Random();
        Generator = Hangman.nextInt(3);

        //Arrays For Computer Difficulty
        //Array for Noob Difficulty
        Noob = new String[3];
        Noob[0] = "House";
        Noob[1] = "Ground";
        Noob[2] = "Furniture";
        //Array for Average Difficulty
        Average = new String[3];
        Average[0] = "Post Malone";
        Average[1] = "White Truck";
        Average[2] = "History Book";
        //Array for Legendary Difficulty
        Legendary = new String[3];
        Legendary[0] = "One Sided Paper";
        Legendary[1] = "The Reagan Administration";
        Legendary[2] = "The Iridocyclitis Kid";

        System.out.println("Welcome to Hangman! For starters what is your name?");
        usersResponse = usersInput.nextLine();
        Player1 = usersResponse;

        System.out.println("Ok " + Player1 + ", would you like to play another person or the computer?\n1 Person\n2 Computer");
        usersResponse = usersInput.nextLine();
        usersResponseNumber = Integer.parseInt(usersResponse);

        boolean EntireCode = true;
        while(EntireCode) {
            //Player 1 vs Player 2
            if(usersResponseNumber == 1) {
                System.out.println("Ok what's the name of Player 2?");
                usersResponse = usersInput.nextLine();
                Player2 = usersResponse;
                System.out.println("Ok! Player 1 is "+Player1+" and Player 2 is "+Player2+". "+Player1+" please look away" +
                        " while "+Player2+" picks the word. Please make it at least 5 letters.");
                usersResponse = usersInput.nextLine().toLowerCase();
                playerWord = usersResponse;
                System.out.println("Ok! tell "+Player1+" the game is ready.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(playerWord);

            }
            //Player 1 vs Computer
            else if(usersResponseNumber == 2) {
                System.out.println("What difficulty do you want to play?\n1 Noob\n2 Average\n3 Legendary");
                usersResponse = usersInput.nextLine();
                usersResponseNumber = Integer.parseInt(usersResponse);
                boolean ResponseAI = true;
                while(ResponseAI) {
                    if(usersResponseNumber == 1) {
                        System.out.println("Ok you'll be playing the easiest difficulty you noob.");
                        playerWord = Noob[Generator];
                        System.exit(0);
                    } else if(usersResponseNumber == 2) {
                        System.out.println("Ok you'll be playing the Average difficulty.");
                        playerWord = Average[Generator];
                        System.exit(0);
                    } else if(usersResponseNumber == 3) {
                        System.out.println("Ok you'll be playing the hardest difficulty you legend.");
                        playerWord = Legendary[Generator];
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Response please select one of the three options.");
                        usersResponse = usersInput.nextLine();
                        usersResponseNumber = Integer.parseInt(usersResponse);
                    }
                }
            }
            //Invalid Response
            else {
                System.out.println("Invalid Response please select one of the two options.");
                usersResponse = usersInput.nextLine();
                usersResponseNumber = Integer.parseInt(usersResponse);
            }
        }
    }
}
