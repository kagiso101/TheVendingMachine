package vending;
import  vending.product.*;

public class OverloadedVendingMachine {

  private int softDrinkQty;
  private int saltySnacksQty;
  private int chocolatesQty;

    // add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
     this.softDrinkQty = softDrinkQty;
     this.saltySnacksQty = saltySnacksQty;
     this.chocolatesQty = chocolatesQty;
    }

   public void addStock(Product product){
      softDrinkQty += 3;
      saltySnacksQty +=3;
      chocolatesQty +=3;
      System.out.print("added stock");
   }
   public void addStock(SaltySnack saltySnack){
        saltySnacksQty += 1;
   }
    public void addStock(SoftDrink softDrink){
        softDrinkQty += 1;
    }
    public void addStock(Chocolate chocolate){
        chocolatesQty += 1;
    }
    public  void buy(){
    System.out.print("buying");

}

    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5,5,5);
        overlo;
    }

}
