import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Random rand = new Random();
        String question = "";
        Scanner input = new Scanner (System.in);
        boolean redEyes;

       while(!question.equalsIgnoreCase("n")){
           System.out.println("Are your eyes red?");
            redEyes = input.nextBoolean();







          if (redEyes == true) {
               System.out.println("get some sleep!");

          }else {
              System.out.println("you look great!");
          }
           System.out.println("Do you want to try again?");
            question = input.next();

        }
    }

    }

