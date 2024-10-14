// import Scanner so I can use the input function.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
// Accept three numbers from the user that will be sorted in assending order.

        System.out.print("This program accepts three numbers from the user, sorts them in ascending order, and prints the results.\n"); 

//Accepts the input and stores the number for future use.
      
        System.out.print("\nEnter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }
//The three inputed numbers get passed to the below method.
  
    public static void displaySortedNumbers(double num1, double num2, double num3) {
          double temp;

    double smallest = 0;
    double middle = 0;
    double largest = 0;
      
    smallest = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3 ? num2 : num3);
    largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);
    middle = (num1 != smallest && num1 != largest) ? num1 : (num2 != smallest && num2 != largest) ? num2 : num3;
    
    System.out.println("The sorted numbers are: " + smallest + ", " + middle + ", " + largest);


        }
          }
      



      
    