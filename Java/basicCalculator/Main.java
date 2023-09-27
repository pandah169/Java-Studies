package basicCalculator;  //Including my package (name of the folder i'm in.);
import java.util.Scanner;  //Importing the class Scanner from java.util package;

//Creating my class;
public class Main
{
  //Creating my main method - THIS IS MANDATORY;
  public static void main(String[] args)
  {
    //My scanner with IN;
    Scanner scanner = new Scanner(System.in);

    //Getting the numbers
    System.out.println("======================");  //Just to make the code more aesthetic;
    System.out.print("Type the first number: ");  //Asking the first number;
    int num1 = scanner.nextInt();  //Storing the number in a variable;
    System.out.print("Type the second number: ");  //Doing the same thing as the first number;
    int num2 = scanner.nextInt();

    //Choosing the operation;
    System.out.println("\nEnter the desired mathematical operation: ");
    System.out.println("1- Sum\n2- Subtraction\n3- Multiplication\n4- Division\n");
    System.out.print("Answer: ");
    int choose = scanner.nextInt();
    System.out.println("");

    //Switch to choose the operation the program will do it;
    switch(choose)
    {
      //Doing the sum;
      case 1:
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
        break;

      //Doing the subtraction;
      case 2:
        int sub = num1 - num2;
        System.out.println("Subtraction of " + num1 + " - " + num2 + " = " + sub);
        break;

      //Doing the multiplication;
      case 3:
        int mult = num1 * num2;
        System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + mult);
        break;

      //Doing the division;
      case 4:
        //Be careful about dividing by zero (not possible);
        if (num2 != 0)
        {
          double div = (double) num1 / num2;
          System.out.println("Division of " + num1 + " / " + num2 + " = " + div);
        }
        else
        {
          System.out.println("Not possible to divide for zero.");
        }
        break;

      default:
        System.out.println("Invalid option.");
        break;
    }
    scanner.close();
    System.out.println("======================");
  }
}
