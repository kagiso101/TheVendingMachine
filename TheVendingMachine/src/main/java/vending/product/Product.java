package vending.product;


import java.util.*;


public class Product  {

    public int totalStock;

    public int totalInStock(int chocStock,int saltyStock, int softStock){
        if(totalStock >= 0) {
            totalStock = chocStock + saltyStock + softStock;
        }
        return totalStock;
    }

public void buy(Product product){
       int remaining = product.totalStock -1;
       System.out.println("Bought : " + product + "remaining stock : " + remaining);
}


    public String description() {

        return "This is a product";
    }

    //adds product to the stock
//    public void addStock(Product product){
//        if(!product.equals(null)) {
//            productList.add(product);
//        }
//        System.out.println("Added the product:" + product);
//    }


//    public int getStock(){
//        for (Object stock : productList){
//            if(!stock.equals(null)){
//                System.out.println(productList.get((int)stock));
//            }
//        }
//        return productList.size();
//    }

}
