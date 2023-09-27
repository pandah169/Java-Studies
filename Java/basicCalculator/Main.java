package estudo1;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("======================");
    System.out.print("Digite o número 1: ");
    int num1 = scanner.nextInt();
    System.out.print("Digite o número 2: ");
    int num2 = scanner.nextInt();

    System.out.println("\nDigite a operação desejada: ");
    System.out.println("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n");
    System.out.print("R: ");
    int escolha = scanner.nextInt();
    System.out.println("");

    switch(escolha)
    {
      case 1:
        int soma = num1 + num2;
        System.out.println("Soma de " + num1 + " + " + num2 + " = " + soma);
        break;

      case 2:
        int subtracao = num1 - num2;
        System.out.println("Subtração de " + num1 + " - " + num2 + " = " + subtracao);
        break;

      case 3:
        int multiplicacao = num1 * num2;
        System.out.println("Multiplicação de " + num1 + " * " + num2 + " = " + multiplicacao);
        break;

      case 4:
        if (num2 != 0)
        {
          double divisao = (double) num1 / num2;
          System.out.println("Divisão de " + num1 + " / " + num2 + " = " + divisao);
        }
        else
        {
          System.out.println("Não é possível dividir por zero.");
        }
        break;

      default:
        System.out.println("Opção inválida.");
        break;
    }
    scanner.close();
    System.out.println("======================");
  }
}

