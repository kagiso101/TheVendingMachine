package greetings;

import java.util.*;

public class HelloWorld {
    ArrayList<String> listOfNames = new ArrayList<String>();
    int nameCounter = 0;


    public void helloFrom(String name){
        if(name != "" && !listOfNames.contains(name)){
           listOfNames.add(name);
           nameCounter++;
           System.out.println("Hello World from : "+ name);
        }
        else {
            System.out.println("Enter A Name!");
        }
    }

}
