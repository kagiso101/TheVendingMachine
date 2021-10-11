package vending;
import  vending.product.*;
import  java.util.*;


public class OverloadedVendingMachine {


    ArrayList vendingMachineProducts = new ArrayList<>();

  private int softDrinkQty;
  private int saltySnacksQty;
  private int chocolatesQty;

    // add a constructor like this to you OverloadedVendingMachine class
    OverloadedVendingMachine(int softDrinkQty1, int saltySnacksQty1, int chocolatesQty1){
        // set the stockLevel instance variables for each product in the constructor
     this.softDrinkQty = softDrinkQty1;
     this.saltySnacksQty = saltySnacksQty1;
     this.chocolatesQty = chocolatesQty1;
     new Product().totalInStock(chocolatesQty1,saltySnacksQty1,softDrinkQty1);
    }


    public void buy(Product product){
        if(vendingMachineProducts.size() > 0){
            for (Object item : vendingMachineProducts) {
                if(product.equals(item)){
                   vendingMachineProducts.remove(item);
                }

            }
            System.out.println("Stock level: " + vendingMachineProducts.size());
        }else{
            System.out.println("you need stock!");
        }
    }


   public void addStock(Product product){


       vendingMachineProducts.add( softDrinkQty);
       vendingMachineProducts.add( softDrinkQty);
       vendingMachineProducts.add( softDrinkQty);

       vendingMachineProducts.add( chocolatesQty);
       vendingMachineProducts.add( chocolatesQty);
       vendingMachineProducts.add( chocolatesQty);


       vendingMachineProducts.add( saltySnacksQty);
       vendingMachineProducts.add( saltySnacksQty);
       vendingMachineProducts.add( saltySnacksQty);

        System.out.print("Stock level is now : " + vendingMachineProducts.size());

   }


 public int  totalStock(){
      return vendingMachineProducts.size();
}


//    public void addStock(SoftDrink softDrink){
//        softDrinkQty += 1;
   // saltySnacksQty += 1;
//        saltySnack.saltySnackList.add(saltySnack);
     //   System.out.print(saltySnack.saltySnackList.size());
//    }
//    public void addStock(Chocolate chocolate){
//        chocolatesQty += 1;
//    }
//    public  void buy(){
//    System.out.print("buying");
//
//}

    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5,5,5);
        overloadedVendingMachine.totalStock();
        Product product = new Product();
        Product salty = new SaltySnack();
        overloadedVendingMachine.addStock(product);

        overloadedVendingMachine.buy(salty);
    





    }

}
