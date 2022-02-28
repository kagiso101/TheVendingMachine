import java.io.IOException;
import java.util.*;


interface testInter{
;
}

  class testClass{

 }

public class Tester extends testClass{


    public void method1() throws Exception{
    System.out.println("hello");
 
    
    }

    public void method2(){
        System.out.println("hello");
       
        
        }
        

    public static void method3()throws Exception{
        System.out.println("hello");
        throw new Exception();
    }

    public static void main(String[] args) {
  

Tester tn = new Tester();
testClass tv= new testClass();

        String s1 = "hello";
        String s2 = "hello" ;

        double d1 = 10.0;
        int x = 10;

        Double d11 = 10.0;
        Integer x1 = 10;



        System.out.println(tv == tn);
        // System.out.println(d11 == x1);
        System.out.println(d1 == x);
        System.out.println(s1 == s2);
     }
}
