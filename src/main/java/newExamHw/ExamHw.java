package newExamHw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExamHw {
    public static void printFullName(String firstName, String lastName){ //Q:2.1 method
        System.out.println(firstName + " " + lastName);
    }

    public static double getPrice(){
        //Q:2.2 method
        double min = 5.0;
        double max = 15.0;
        double random = ThreadLocalRandom.current().nextDouble(min, max);
        return Math.round(random* 100.0) / 100.0;
    }

    public static void printSizes(String[] size) { //Q:2.3 method
        for (int s = 0; s < size.length; s++) {
            System.out.println(size[s]);

        }
    }

      public static void printOrder() { //Q: 2.4
       Scanner scanner = new Scanner(System.in);

          System.out.println("Welcome to Burger-Joint");
          System.out.print("Is it true or false that your order will be to go?");
          boolean toGo = scanner.nextBoolean();
          scanner.nextLine();

          System.out.print("What type of burger do you want today? Cheese, ham or turkey?");
          String typeBurger = scanner.nextLine();

          System.out.print("Please enter a tip of 0%, 5%, 10%, 15%, or 20% tip!");
          double tipPercent = scanner.nextDouble();
          scanner.nextLine();

          System.out.print("What is the name for your order?");
          String name = scanner.nextLine();


          double price = getPrice();
          double totalPricing = price + (price* tipPercent) / 100.00;

          System.out.println("Order Name: " + name);
          System.out.println("To Go: " + toGo);
          System.out.println("Burger Type: " + typeBurger);
          System.out.println("Regular Price: " + price);
          System.out.println("Tip Amount: " + tipPercent + "%");
          System.out.println("Total including tip: $" + totalPricing);

      }
      public static double priceAfterDiscount(double[] productPrices, int discountAmount){ //Q:3.1
        double totalPrice = 0;
         for (double price : productPrices){
             totalPrice += price;
         }

        return totalPrice;
      }
      public static void rollDice(){
         Random random = new Random();
         int diceOne = random.nextInt(6) + 1;
         int diceTwo = random.nextInt(6) + 1;
          System.out.println(diceOne + " , " + diceTwo);
      }
       public static void isPalindrome(){


       }






    public static void main(String[] args) {
       String firstName = "Latavia"; //Q:1
       String lastName = "Jefferson"; //Q:1
       String[] sizes = {"S","M","L"}; //Q:1.2
       final String expirationdate = "09-12-2024"; //Q:1.3
        int getPrice = (int)(Math.random()* 16); //Q:2,2 method
        String[] printSizes = {""};

        System.out.println(firstName); //Q:1
        System.out.println(lastName); // Q:1
        System.out.println(sizes[0]); //Q: 1.2
        System.out.println(sizes[1]); // Q:1.2
        System.out.println(sizes[2]); // Q: 1.2
        System.out.println(expirationdate); //Q: 1.3
        printFullName(firstName,lastName); // Q: 2 method
        System.out.println(getPrice); //Q: 2.2 method
        String[] size = {"S", "L", "XL"}; //Q: 2.3 method
        printSizes(size); //Q: 2.3 method
        printOrder(); //Q: 2.4 method
        double[] prices = {23.0, 17.0, 32.0, 12.0};
        int discount = 15;
        double totalPrice = priceAfterDiscount(prices,discount);
        System.out.println("Total Price after Discount: $" + totalPrice);
        rollDice();
    }
}
