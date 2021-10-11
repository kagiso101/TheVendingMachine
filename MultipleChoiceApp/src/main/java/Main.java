import java.util.Scanner;

public class Main extends Questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            questionOne();
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            String value = params[0];
            questionOneAnswer(value);
           break;
        }
        while(true){
            questionTwo();
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            String value = params[0];
            questionTwoAnswer(value);
            break;
        }
        while(true){
            questionThree();
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            String value = params[0];
            questionThreeAnswer(value);
            break;
        }
        while(true){
            questionFour();
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            String value = params[0];
            questionFourAnswer(value);
            break;
        }
        while(true){
            questionFive();
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            String value = params[0];
            questionFiveAnswer(value);
            break;
        }
        if(score >=3){
            System.out.println("Well done you passed");
        }
        else {
            System.out.println("You failed! Try again.");
        }


    }
}
