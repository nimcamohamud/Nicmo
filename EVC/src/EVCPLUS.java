import java.util.Scanner;

public class EVCPLUS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter *770£: ");
        String code = scanner.nextLine();

        if (code.equals("*770£")) {
            System.out.println("EVCPLUS is now open.");

            final int PIN = 1234;
            int balance = 1000;

            System.out.print("Please enter your PIN: ");
            int enteredPIN = scanner.nextInt();

            if (enteredPIN == PIN) {
                System.out.println("\nPIN is correct!");
                System.out.println("-- EVCPLUS SERVICES --");
                System.out.println("1. Withdraw money");
                System.out.println("2. Deposit money");
                System.out.println("3. Check balance");
                System.out.println("4. Salaam Bank");
                System.out.println("5. Management");
                System.out.println("6. Summary report");
                System.out.println("7. Recharge airtime");
                System.out.println("8. Exit");

                System.out.print("Please choose a service (1-8): ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.print("Enter the amount to withdraw: ");
                        int amount = scanner.nextInt();
                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.println("You have withdrawn $" + amount);
                            System.out.println("Your current balance: $" + balance);
                        } else {
                            if (amount <= 0) {
                                System.out.println("Invalid amount entered.");
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter the amount to deposit: ");
                        int amount = scanner.nextInt();
                        if (amount > 0) {
                            balance += amount;
                            System.out.println("You have deposited $" + amount);
                            System.out.println("Your new balance: $" + balance);
                        } else {
                            System.out.println("Invalid amount entered.");
                        }
                    }
                    case 3 -> System.out.println("Your balance is: $" + balance);
                    case 4 -> System.out.println("Salaam Bank service is now open.");
                    case 5 -> System.out.println("You have entered the management section.");
                    case 6 -> System.out.println("This is a brief summary report of your account.");
                    case 7 -> System.out.println("You can now recharge your airtime.");
                    case 8 -> System.out.println("You have exited the system. Thank you!");
                    default -> System.out.println("Invalid choice. Please select from 1 to 8.");
                }

            } else {
                System.out.println("Incorrect PIN.");
            }

        } else {
            System.out.println("Incorrect USSD code. Please enter *770# to access.");
        }


    }
}
