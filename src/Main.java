import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String>movies = new ArrayList<String>();
        String userInput, secondResponse;
        Random randomMovie = new Random();

        do{
            System.out.println("Enter your favourite movie");
            userInput = input.nextLine();
            movies.add(userInput);

            System.out.println("Do you want to enter another move? Answer ('Y'/'Q') Y = Yes and Q = Quit");
            secondResponse = input.nextLine();


        }while(!secondResponse.equalsIgnoreCase("q"));
        Collections.sort(movies);

        System.out.println(movies);
        int suggestion = randomMovie.nextInt(movies.size());
        System.out.println("I recommend you watch " + movies.get(suggestion) + ". See you later!");
    }
}
