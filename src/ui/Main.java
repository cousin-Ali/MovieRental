package ui;

import model.Customer;
import model.Movie;
import model.Rental;

public class Main {
  
  public static void main(String[] args) {
    Movie matrix = new Movie("The Matrix", Movie.REGULAR);
    Movie zootopia = new Movie("Zootopia", Movie.CHILDRENS);
    Movie blackPanther = new Movie("Black Panther ", Movie.NEW_RELEASE);
    Customer ali = new Customer("Cousin Ali");
    ali.addRental(new Rental(matrix, 7));
    ali.addRental(new Rental(zootopia, 7));
    ali.addRental(new Rental(blackPanther, 2));
    
    System.out.println(ali.statement());
  }
}
