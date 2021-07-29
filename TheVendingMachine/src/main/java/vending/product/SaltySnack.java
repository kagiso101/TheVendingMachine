package vending.product;

import java.util.*;

public class SaltySnack extends Product{


public int saltySnackStock;



public int totalInStock(int saltySnackStock1){
  this.saltySnackStock = saltySnackStock1;
  if(saltySnackStock >= 0) {
      System.out.println("Yaay we've got stock!");
  }
  return saltySnackStock;
}




    @Override
    public String description() {
        return "This is a Salty Snack";
    }
}

