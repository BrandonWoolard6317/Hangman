import java.util.Scanner;
import java.util.Random;

public class Woolard_Hangman {
    public static boolean showHangman(String playerWord, int a,int q){
        String hangman = "";
        q++;
        if(a == 1){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: 15        |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 2){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"        |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 3){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|               |              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"        |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 4){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"        |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));

        }
        else if(a == 5){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"        |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 6){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|               |              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"        |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 7){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|             / |              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 8){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|             / | \\            |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 9){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|             / | \\            |");
            System.out.println("|              /               |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 10){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|             / | \\            |");
            System.out.println("|              / \\             |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 11){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|             / | \\            |");
            System.out.println("|              / \\             |");
            System.out.println("|             /                |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 12){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|             / | \\            |");
            System.out.println("|              / \\             |");
            System.out.println("|             /   \\            |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 13){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|            _/ | \\            |");
            System.out.println("|              / \\             |");
            System.out.println("|             /   \\            |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 14){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|            _/ | \\_           |");
            System.out.println("|              / \\             |");
            System.out.println("|             /   \\            |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 15){
            System.out.println(" ______________________________");
            System.out.println("|               |              |");
            System.out.println("|               |              |");
            System.out.println("|               O              |");
            System.out.println("|              /|\\             |");
            System.out.println("|            _/ | \\_           |");
            System.out.println("|              / \\             |");
            System.out.println("|           __/   \\            |");
            System.out.println("|                              |");
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
        else if(a == 16){
            System.out.println(" ______________________________");
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
            System.out.println("|     Attempts Left: "+(16-a)+"         |");
            System.out.println(" ______________________________");
            System.out.println(" Word: "+drawLines(playerWord));
        }
            return true;
    }

    public static String drawLines(String playerWord) {
        String Display = "";
        for(int i = 0; i < playerWord.length(); i++) {
            Display += "-";
        }
        return Display;
    }

    /*public static String replaceLines(String playerWord, String linedWord){


    }*/


    public static boolean checkLetters(String guessing,String playerWord){
        return playerWord.contains(guessing);
    }

    public static String usersLetter(String usersResponse, String hik, String newLetter, int a){
        if(a == 2){
            newLetter = hik + " " + usersResponse;
        }
        else if(a > 2){
            newLetter = newLetter + " " + hik;
        }
        return hik + " " + usersResponse;
    }

    public static void main(String[] args) {
        //Variables
        Scanner usersInput = new Scanner(System.in);
        String usersResponse;
        String Player1;
        String Player2 = "Placeholder Name";
        String playerWord;
        String Difficulty = "";
        String l = "";
        String linedWord = "";
        String hik = "";
        String newLetter = "";
        int usersResponseNumber;
        int Generator;
        int a = 0;
        int i = 0;
        int g = 0;
        int p1w = 0;
        int p2w = 0;
        int cw;
        int attempt = 0;
        int q = 0;
        String[] Noob;
        String[] Average;
        String[] Legendary;
        Random Hangman = new Random();
        Generator = Hangman.nextInt(3);

        //Arrays For Computer Difficulty
        //Array for Noob Difficulty
        Noob = new String[3];
        Noob[0] = "house";
        Noob[1] = "ground";
        Noob[2] = "furniture";
        //Array for Average Difficulty
        Average = new String[3];
        Average[0] = "post malone";
        Average[1] = "white truck";
        Average[2] = "history book";
        //Array for Legendary Difficulty
        Legendary = new String[3];
        Legendary[0] = "one sided paper";
        Legendary[1] = "the reagan administration";
        Legendary[2] = "the iridocyclitis kid";

        System.out.println("Welcome to Hangman! For starters what is your name?");
        usersResponse = usersInput.nextLine();
        Player1 = usersResponse;

        System.out.println("Ok " + Player1 + ", would you like to play another person or the computer?\n1 Person\n2 Computer");
        usersResponse = usersInput.nextLine();
        usersResponseNumber = Integer.parseInt(usersResponse);

        boolean Loop = true;
        while (Loop) {
            g++;
            if (g > 1) {
                System.out.println("What do you want to play?\n1 Person\n2 Computer");
                usersResponse = usersInput.nextLine();
                usersResponseNumber = Integer.parseInt(usersResponse);
                if (usersResponseNumber == 1) {
                    System.out.println("Are you playing the same person?\n1 Yes\n2 No");
                    usersResponse = usersInput.nextLine();
                    usersResponseNumber = Integer.parseInt(usersResponse);
                    if (usersResponseNumber == 1) {
                        System.out.println("Ok, you are on game " + g + " with " + Player2 + ".\n" + Player1 + "'s Wins: " + p1w + "\n" +
                                Player2 + "'s Wins: " + p2w);
                    } else if (usersResponseNumber == 2) {
                        g = 0;
                        System.out.println("Ok what's the name of Player 2?");
                        usersResponse = usersInput.nextLine();
                        Player2 = usersResponse;
                        System.out.println(Player1 + " will be playing " + Player2 + ".");
                    } else {
                        System.out.println("Invalid Response please select one of the two options.");
                    }
                } else if (usersResponseNumber == 2) {
                    g = 0;
                    p1w = 0;
                    p2w = 0;
                    System.out.println("Ok, since you're now playing the computer now you're progress against " + Player2 + " " +
                            "has been lost.");
                } else {
                    System.out.println("Invalid Response please select one of the two options.");
                }
            }
            //Player 1 vs Player 2
            if (usersResponseNumber == 1) {
                if (g == 1) {
                    System.out.println("Ok what's the name of Player 2?");
                    usersResponse = usersInput.nextLine();
                    Player2 = usersResponse;
                    System.out.println("Ok! Player 1 is " + Player1 + " and Player 2 is " + Player2 + ".");
                }
                System.out.println("Ok " + Player2 + ", pick a word with at least 5 letters and " + Player1 + " you need to" +
                        " look away until they have submitted the word.");
                usersResponse = usersInput.nextLine().toLowerCase();
                playerWord = usersResponse;
                System.out.println("Ok! tell " + Player1 + " the game is ready.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ok " + Player1 + ", you can go ahead and guess the word.");
                boolean playerVsPlayer=true;
                while(playerVsPlayer) {
                    a++;
                    System.out.println(showHangman(playerWord,a,q));
                    usersResponse = usersInput.nextLine().toLowerCase();
                    hik = usersResponse;
                    linedWord = drawLines(playerWord);
                    if(checkLetters(usersResponse,playerWord)){
                        System.out.println("Testing method to return boolean for plugging in the correct guess");
                    }
                    else{

                        System.out.println("You've guessed incorrectly... guess again!");
                    }
                    if(a > 1){
                        System.out.println(usersLetter(usersResponse,hik,newLetter,a));
                    }
                }
            }
            //Player 1 vs Computer
            if (usersResponseNumber == 2) {
                System.out.println("What difficulty do you want to play?\n1 Noob\n2 Average\n3 Legendary");
                usersResponse = usersInput.nextLine();
                usersResponseNumber = Integer.parseInt(usersResponse);
                playerWord = "";
                if (usersResponseNumber == 1) {
                    System.out.println("Ok you'll be playing the easiest difficulty you noob.");
                    playerWord = Noob[Generator];
                    Difficulty = "Noob Difficulty";
                    l = "one word";
                } else if (usersResponseNumber == 2) {
                    System.out.println("Ok you'll be playing the Average difficulty.");
                    playerWord = Average[Generator];
                    Difficulty = "Avaerage Difficulty";
                    l = "two words";
                } else if (usersResponseNumber == 3) {
                    System.out.println("Ok you'll be playing the hardest difficulty you legend.");
                    playerWord = Legendary[Generator];
                    Difficulty = "Legendary Difficulty";
                    l = "three words";
                } else {
                    System.out.println("Invalid Response please select one of the three options.");
                    usersResponse = usersInput.nextLine();
                    usersResponseNumber = Integer.parseInt(usersResponse);
                }
                System.out.println("Ok " + Player1 + ", since you're playing " + Difficulty + ", there will be a total of " + l +
                        " to guess.");
                boolean playerVsComputer=true;
                while(playerVsComputer) {
                    a++;
                    if(a > 1){
                        System.out.println("Guess again.");
                    }
                    System.out.println(playerWord);
                    System.out.println(drawLines(playerWord));
                    usersResponse = usersInput.nextLine().toLowerCase();
                    if(checkLetters(usersResponse,playerWord)){
                        System.out.println("Test for computer code.");
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
