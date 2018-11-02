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
        int i = 0;
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

            //Player 1 vs Player 2
        boolean Loop = true;
        while (Loop) {
            if(usersResponseNumber == 1) {
                System.out.println("Ok what's the name of Player 2?");
                usersResponse = usersInput.nextLine();
                Player2 = usersResponse;
                System.out.println("Ok! Player 1 is " + Player1 + " and Player 2 is " + Player2 + ".");
                boolean playerVSPlayer = true;
                while (playerVSPlayer) {
                    System.out.println("Ok "+Player2+", pick a word with at least 5 letters and "+Player1+" you need to" +
                            " look away until they have submitted the word.");
                    usersResponse = usersInput.nextLine().toLowerCase();
                    playerWord = usersResponse;
                    System.out.println("Ok! tell " + Player1 + " the game is ready.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(playerWord);
                    playerWord = playerWord.substring(0,i)+playerWord.substring(i+2);
                    System.out.println(playerWord);
                    System.exit(0);
                    if(playerWord.substring(0,0) == usersResponse){
                        playerWord.substring(0,i) = "-";
                    }


                }
            }
            //Player 1 vs Computer
                if (usersResponseNumber == 2) {
                    boolean playerVSComputer = true;
                    while (playerVSComputer) {
                        System.out.println("What difficulty do you want to play?\n1 Noob\n2 Average\n3 Legendary");
                        usersResponse = usersInput.nextLine();
                        usersResponseNumber = Integer.parseInt(usersResponse);
                        if (usersResponseNumber == 1) {
                            System.out.println("Ok you'll be playing the easiest difficulty you noob.");
                            playerWord = Noob[Generator];
                            System.exit(0);
                        } else if (usersResponseNumber == 2) {
                            System.out.println("Ok you'll be playing the Average difficulty.");
                            playerWord = Average[Generator];
                            System.exit(0);
                        } else if (usersResponseNumber == 3) {
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
