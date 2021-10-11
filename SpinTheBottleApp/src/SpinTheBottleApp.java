import java.util.*;

public class SpinTheBottleApp {
  public static List<String> userList = new ArrayList<String>();
  public  int usersInGame = 0;

    //***  //we need users to play

          //add users to the game
    public void addToGame(String userName){
        if(!userList.equals("")){
            if(usersInGame < 6 ) {
                if( !userList.contains(userName)) {
                    userList.add(userName);
                    usersInGame++;
                    System.out.println("Welcome to the game :" + userName);
                }
                else System.out.print("It appears " + userName + " " + "Is already in the game!" );
            }
            else System.out.println("Sorry The game is full");
        }
        else System.out.println("Please enter a name");
    }



    //***  //play game
  

    //***  //outcome


}
