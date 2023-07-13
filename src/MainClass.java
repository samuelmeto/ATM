import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        String transactionOptions = "Press 1 to view the balance\n" +
                "Press 2 to withdraw money\n" +
                "Press 3 to deposit money\n" +
                "Press 4 to exit";

        double MertBalance = 5000;
        String MertIban = "TR 34 3456 7575 8473 8493 34";
        String MertUsername = "samuelmeto";
        String MertPassword = "Mert167.";

        double Bunyaminbalance = 8000;
        String BunyaminIban = "TR 45 5857 3030 3849 4839 32";
        String Bunyaminusername = "bunnyinthegrave";
        String Bunyaminpassword = "sagopa123";

        System.out.println("******* Welcome to the ATM *******");
        System.out.println("Please enter your information");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(MertUsername) && password.equals(MertPassword)) {
            System.out.println("Login to Mert's account");

            boolean exit = false;
            while (!exit) {
                System.out.println(transactionOptions);
                System.out.println("Please make a selection");
                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        System.out.println("Balance: " + MertBalance);
                        System.out.println("Do you want to take any further action? (yes or no)");
                        scanner.nextLine(); // Consume the new line character left in the buffer
                        String response1 = scanner.nextLine();

                        if (response1.equalsIgnoreCase("yes")) {
                            // Code block for further action
                            System.out.println("Further action is taken.");
                        } else if (response1.equalsIgnoreCase("no")) {
                            System.out.println("GOODBYE");
                            exit = true;
                        } else {
                            System.out.println("Invalid response.");
                        }
                        break;

                    case 2:
                        System.out.println("Please enter the amount you want to withdraw");
                        int withdrawAmount = scanner.nextInt();
                        if (MertBalance >= withdrawAmount) {
                            MertBalance -= withdrawAmount;
                            System.out.println("The remaining balance: " + MertBalance);
                        } else {
                            System.out.println("Insufficient balance");
                        }

                        System.out.println("Do you want to take any further action? (yes or no)");
                        scanner.nextLine(); // Consume the new line character left in the buffer
                        String response2 = scanner.nextLine();

                        if (response2.equalsIgnoreCase("yes")) {
                            // Code block for further action
                            System.out.println("Further action is taken.");
                        } else if (response2.equalsIgnoreCase("no")) {
                            System.out.println("GOODBYE");
                            exit = true;
                        } else {
                            System.out.println("Invalid response.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter the amount you want to deposit");
                        int depositAmount = scanner.nextInt();
                        if (depositAmount <= MertBalance) {
                            System.out.println("Enter IBAN");
                            scanner.nextLine(); // Consume the new line character left in the buffer
                            String depositIban = scanner.nextLine();
                            if (depositIban.equals(BunyaminIban)) {
                                System.out.println("Money is depositing");
                                MertBalance -= depositAmount;
                                System.out.println("The remaining balance: " + MertBalance);
                            }
                        } else {
                            System.out.println("Insufficient balance");
                        }

                        System.out.println("Do you want to take any further action? (yes or no)");
                        String response3 = scanner.nextLine();

                        if (response3.equalsIgnoreCase("yes")) {
                            // Code block for further action
                            System.out.println("Further action is taken.");
                        } else if (response3.equalsIgnoreCase("no")) {
                            System.out.println("GOODBYE");
                            exit = true;
                        } else {
                            System.out.println("Invalid response.");
                        }
                        break;

                    case 4:
                        System.out.println("GOODBYE");
                        exit = true; // Set exit flag to true to break out of the loop
                        break;

                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
            }
        } else if (username.equals(Bunyaminusername) && password.equals(Bunyaminpassword)) {
            System.out.println("Login to Bünyamin's account");

            boolean exit = false;
            while (!exit) {
                System.out.println(transactionOptions);
                System.out.println("Please make a selection");
                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        System.out.println("Balance: " + Bunyaminbalance);
                        System.out.println("Do you want to take any further action? (yes or no)");
                        scanner.nextLine(); // Consume the new line character left in the buffer
                        String response1 = scanner.nextLine();

                        if (response1.equalsIgnoreCase("yes")) {
                            // Code block for further action
                            // Code block for further action
                            System.out.println("Further action is taken.");
                        } else if (response1.equalsIgnoreCase("no")) {
                            System.out.println("GOODBYE");
                            exit = true;
                        } else {
                            System.out.println("Invalid response.");
                        }
                        break;

                    case 2:
                        System.out.println("Please enter the amount you want to withdraw");
                        int withdrawAmount = scanner.nextInt();
                        if (Bunyaminbalance >= withdrawAmount) {
                            Bunyaminbalance -= withdrawAmount;
                            System.out.println("The remaining balance: " + Bunyaminbalance);
                        } else {
                            System.out.println("Insufficient balance");
                        }

                        System.out.println("Do you want to take any further action? (yes or no)");
                        scanner.nextLine(); // Consume the new line character left in the buffer
                        String response2 = scanner.nextLine();

                        if (response2.equalsIgnoreCase("yes")) {
                            // Code block for further action
                            System.out.println("Further action is taken.");
                        } else if (response2.equalsIgnoreCase("no")) {
                            System.out.println("GOODBYE");
                            exit = true;
                        } else {
                            System.out.println("Invalid response.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter the amount you want to deposit");
                        int depositAmount = scanner.nextInt();
                        if (depositAmount <= Bunyaminbalance) {
                            System.out.println("Enter your IBAN");
                            scanner.nextLine(); // Consume the new line character left in the buffer
                            String depositIban = scanner.nextLine();
                            if (depositIban.equals(MertIban)) {
                                System.out.println("Money is depositing");
                                Bunyaminbalance -= depositAmount;
                                System.out.println("The remaining balance: " + Bunyaminbalance);
                            }
                        } else {
                            System.out.println("Insufficient balance");
                        }

                        System.out.println("Do you want to take any further action? (yes or no)");
                        String response3 = scanner.nextLine();

                        if (response3.equalsIgnoreCase("yes")) {
                            // Code block for further action
                            System.out.println("Further action is taken.");
                        } else if (response3.equalsIgnoreCase("no")) {
                            System.out.println("GOODBYE");
                            exit = true;
                        } else {
                            System.out.println("Invalid response.");
                        }
                        break;

                    case 4:
                        System.out.println("GOODBYE");
                        exit = true; // Set exit flag to true to break out of the loop
                        break;

                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }
}





