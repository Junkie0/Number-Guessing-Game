import java.util.Scanner;
public class Game {
    public static void guessingNumberGame(){

//        Scanner class
        Scanner sc = new Scanner(System.in);

//        Generate the numbers
        int number = 1 + (int)(10*Math.random());

//        Trails
        int trails = 1;
        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 10."
        + " Guess the number,"
        + " Within 3 trails");

//        Iterate over Trails
        for (i = 0; i <= trails; trails++){
            System.out.println("Guess the number");

//            take the input
            guess = sc.nextInt();

//            if the number is guessed
            if (number == guess){
                System.out.println("Congratulation you guess the number");
                break;
            }
            else if (number > guess && i != trails -1){
                System.out.println("the number is greater than " + guess);
            }
            else if (number < guess && i != trails -1 ){
                System.out.println("The number is smaller than  "+ guess);
            }
        }

    }
    public static void main(String arg[]){
//        Call the function
        guessingNumberGame();
    }
}
