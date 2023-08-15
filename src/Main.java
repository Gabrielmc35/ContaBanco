import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
         int number;
         String ag;
         String clientName;
         float balance;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o numero ");

        number = scan.nextInt();

        System.out.println("Por favor digite o nome do cliente");

        clientName= scan.next();

        System.out.println("Por favor digite o numero da agencia");

        ag = scan.next();

        System.out.println("Por favor digite o saldo");

        balance = scan.nextFloat();

        ContaTerminal NovaConta = new ContaTerminal(number,ag,clientName,balance);

        System.out.println(NovaConta.toString());


    }
    }
