public class Questions {

    protected static int score = 0;

    public static void questionOne(){
        System.out.println("How many planets exist in our solar system?" + "\n" + "A.6"  + "\n" +"B.10"  + "\n" +"C.8"  + "\n" +"D.11");
    }

    public static String questionOneAnswer(String answerOne){
        if(answerOne.toUpperCase().equals("C")){
            System.out.println("Correct");
            score++;
        }
        else {
            System.out.println("Incorrect");
        }
        return answerOne;
    }

    public static void questionTwo(){
        System.out.println("How many continents are there on planet Earth" + "\n" + "A.9"  + "\n" +"B.7"  + "\n" +"C.8"  + "\n" +"D.10");
    }
    public static String questionTwoAnswer(String answerOne){
        if(answerOne.toUpperCase().equals("B")){
            System.out.println("Correct");
            score++;
        }
        else {
            System.out.println("Incorrect");
        }
        return answerOne;
    }
    public static void questionThree(){
        System.out.println("Which one of the following programming languages was developed by Sun microsystems" + "\n" + "A.Java"  + "\n" +"B.javaScript"  + "\n" +"C.C++"  + "\n" +"D.Python");
    }
    public static String questionThreeAnswer(String answerOne){
        if(answerOne.toUpperCase().equals("A")){
            System.out.println("Correct");
            score++;
        }
        else {
            System.out.println("Incorrect");
        }
        return answerOne;
    }
    public static void questionFour(){
        System.out.println("Which language uses console.log to print outputs to the screen" + "\n" + "A.Java"  + "\n" +"B.Python"  + "\n" +"C.C++"  + "\n" +"D.javaScript");
    }
    public static String questionFourAnswer(String answerOne){
        if(answerOne.toUpperCase().equals("D")){
            System.out.println("Correct");
            score++;
        }
        else {
            System.out.println("Incorrect");
        }
        return answerOne;
    }
    public static void questionFive(){
        System.out.println("Which football player is the best in the world" + "\n" + "A.L Messi"  + "\n" +"B.C Ronaldo"  + "\n" +"C.K Benzema"  + "\n" +"D. L Suarez");
    }
    public static String questionFiveAnswer(String answerOne){
        if(answerOne.toUpperCase().equals("B")){
            System.out.println("Correct");
            score++;
        }
        else {
            System.out.println("Incorrect");
        }
        return answerOne;
    }

}
