import java.util.Random;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Random randomPass = new Random();
    Scanner userPass = new Scanner(System.in);
    String charactersPass1 = "0123456789";
    String charactersPass2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    String charactersPass3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()";

    System.out.print("Set password length: ");
    int passLength = userPass.nextInt();
    System.out.print("");

    System.out.print("Set the type of password you want:");
    System.out.print("\n1- Only numbers\n2- Numbers and Letters\n3- Numbers, Letters and Special Characters\n");
    System.out.print("Answer: ");
    int typeOfPassword = userPass.nextInt();
    System.out.println("");

    StringBuilder randomString = new StringBuilder();

    switch(typeOfPassword)
    {
      case 1:
        for(int i = 0; i <= passLength; i++)
        {
          int randomIndex = randomPass.nextInt(charactersPass1.length());
          char randomChar = charactersPass1.charAt(randomIndex);
          randomString.append(randomChar);
        }
        System.out.println("Your password is: " + randomString.toString());
        break;
      case 2:
        for(int i = 0; i < passLength; i++)
        {
          int randomIndex = randomPass.nextInt(charactersPass2.length());
          char randomChar = charactersPass2.charAt(randomIndex);
          randomString.append(randomChar);
        }
        System.out.println("Your password is: " + randomString.toString());
        break;
      case 3:
        for(int i = 0; i < passLength; i++)
        {
          int randomIndex = randomPass.nextInt(charactersPass3.length());
          char randomChar = charactersPass3.charAt(randomIndex);
          randomString.append(randomChar);
        }
        System.out.println("Your password is: " + randomString.toString());
        break;
      default:
        System.out.println("Invalid option, please try again.");
        break;
    }
    userPass.close();
  }
}