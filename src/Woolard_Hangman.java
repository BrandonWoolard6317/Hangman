import java.util.Scanner;
import java.util.Random;

public class Woolard_Hangman {
    public static void main(String[] args){
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
        Scanner usersInput;
        String yesOrNo;
        String[] Noob;
        String[] Average;
        String[] Legendary;

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

        System.out.println("Welcome to Hangman! Would you like to play another person or the computer?");
    }
}
