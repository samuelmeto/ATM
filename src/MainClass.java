import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        String transacitonoptions = "Press 1 to view the balance" + "Press 2 to withdraw money" +
                "Press 3 to deposit money" + "Press 4 to exit";

        double Mertbalance = 5000;
        String MertIban = "TR 34 3456 7575 8473 8493 34";
        String Mertusername = "samuelmeto";
        String mertpassword = "Mert167.";

        double Bunyaminbalance = 8000;
        String BunyaminIban = "TR 45 5857 3030 3849 4839 32";
        String Bunyaminusername = "bunnyinthegrave";
        String Bunyaminpassword = "sagopa123";

        System.out.println("******* Welcome to the ATM *******");
        System.out.println("Please enter your informations");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username : ");
        String username = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();


    }
}
