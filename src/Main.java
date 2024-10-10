import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

String partyAfil = " ";
 Scanner in = new Scanner(System.in);

        System.out.print("Enter your party affiliation [R, D, I]:  ");



        partyAfil = in.nextLine();
    if(partyAfil.equalsIgnoreCase("R"))
    {
        System.out.println("You got a Republican Elephant");



    }
    else if (partyAfil.equalsIgnoreCase("D")) {

        System.out.println("You got a Democratic Donkey");



    }
    else if (partyAfil.equalsIgnoreCase("I")) {
        System.out.println("You are an Independent!");
    }
    else
    {
        System.out.println("I'm not sure what party " + partyAfil + " is.");
    }


    }

}