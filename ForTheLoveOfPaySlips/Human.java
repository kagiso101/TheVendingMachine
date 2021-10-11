/**
 * Human
 */
public class Human {

    float hormones() {
      
     
        float f = 0.0f;
        try{
           f = Float.valueOf(f).floatValue();
       return f;
        }
        catch(NumberFormatException nfe){
           System.out.println("Invalid input " + f);
           f = Float.NaN ;
           return f;
        }
        finally { System.out.println("finally");  
     
    }
 
    }

    public void breathe() {
        System.out.println("breathing....");
    }

    protected void reproduce() {
        System.out.println("reproducing....");
    }

    public static void main(String[] args) {

        Boy child = new Boy();
        child.breathe();  //human method
        child.testosterone(); //man method
        child.strength(); //child method

        System.out.println("man referencing" + "\n");

        Man person = new Boy(); //new boy from Man ref
        person.breathe(); //Man method
        person.testosterone(); //man method
        person.reproduce(); //human method visible to sub classes

        System.out.println("casting");

        Human human = new Boy();
        human.breathe();
        ((Boy)human).strength();

        Man man = new Man();
    
        
        System.out.println("woman referencing" + "\n");

      
       
        Girl girl = new Girl();

        Boy boy = new Boy();
        girl.periodPains();
        girl.menopause();
        

        System.out.print(boy instanceof Man);


        // try {
        //     girl.breathe();
        // } catch (Exception e) {
        //     //TODO: handle exception

        // }

    }

    

}

class Man extends Human {

    public void testosterone() {
        System.out.println("i have testosterone");
    }
}

class Boy extends Man {
    public void strength() {
        System.out.println("i have energy");
    }
}

class Women extends Human {

    public void menopause() {

        System.out.println("no more babies");
    }

}

class Girl extends Women {

    public void periodPains() {
        System.out.println("monthly cycle");
    }

}