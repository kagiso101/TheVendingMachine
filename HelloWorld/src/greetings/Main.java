package greetings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Please Enter A name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        helloWorld.helloFrom(input);
    }
}
