package randomPasswordGenerator;  //Including my package (name of the folder i'm in.);
//Importing the classes i will use
import java.util.Random;
import java.util.Scanner;

//Creating my class;
public class Main
{
  //Creating my main method - THIS IS MANDATORY;
  public static void main(String[] args)
  {
    //Object of the class Random to generate random numbers;
    Random randomPass = new Random();
    //Object of the class Scanner to read the user inputs;
    Scanner userPass = new Scanner(System.in);

    //Strings that each represent a set of characters that can be used to generate passwords,
    //depending on the user's choice;
    String charactersPass1 = "0123456789";  //Numbers;
    String charactersPass2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";  //Numbers and characters;
    String charactersPass3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()";  //Number, caracthers and special caracthers;

    //Getting the password length;
    System.out.print("Set password length: ");
    int passLength = userPass.nextInt();
    System.out.print("");

    //Getting the type of password;
    System.out.print("Set the type of password you want:");
    System.out.print("\n1- Only numbers\n2- Numbers and Letters\n3- Numbers, Letters and Special Characters\n");
    System.out.print("Answer: ");
    int typeOfPassword = userPass.nextInt();
    System.out.println("");

    //StringBuilder instance called randomString. This class will be used to construct the needed password;
    StringBuilder randomString = new StringBuilder();

    //Switch for the option choosed;
    switch(typeOfPassword)
    {
      //FIRST CASE - JUST NUMBERS
      case 1:
        
        for(int i = 0; i <= passLength; i++)
        {
          int randomIndex = randomPass.nextInt(charactersPass1.length());
          char randomChar = charactersPass1.charAt(randomIndex);
          randomString.append(randomChar);
        }
        System.out.println("Your password is: " + randomString.toString());
        break;
      //SECOND CASE - NUMBERS AND LETTERS
      case 2:
        for(int i = 0; i < passLength; i++)
        {
          int randomIndex = randomPass.nextInt(charactersPass2.length());
          char randomChar = charactersPass2.charAt(randomIndex);
          randomString.append(randomChar);
        }
        System.out.println("Your password is: " + randomString.toString());
        break;
      //CASE 3 - NUMBERS, LETTERS, AND SPECIAL CHARACTERS
      case 3:
        for(int i = 0; i < passLength; i++)
        {
          int randomIndex = randomPass.nextInt(charactersPass3.length());
          char randomChar = charactersPass3.charAt(randomIndex);
          randomString.append(randomChar);
        }
        System.out.println("Your password is: " + randomString.toString());
        break;
      //In case of invalid options.
      default:
        System.out.println("Invalid option, please try again.");
        break;
    }
    //Closing the Scanner
    userPass.close();
  }
}
