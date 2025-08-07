package reyjomara;

import java.util.Scanner;
import banking.bankingSystem;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankingSystem bc[] = new bankingSystem[10];
        int registeredAccounts = 0;

        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you feel like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int response;
                do {
                    System.out.println("1. Register Account");
                    System.out.println("2. Sign Account");
                    System.out.println("3. View All Accounts");
                    System.out.println();
                    System.out.print("Enter Selection: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            if (registeredAccounts < 10) {
                                System.out.print("Enter Account No.: ");
                                int accNo = sc.nextInt();
                                System.out.print("Set Account Pin: ");
                                int pin = sc.nextInt();
                                bc[registeredAccounts] = new bankingSystem(accNo, pin, 0.0f);
                                registeredAccounts++;
                                System.out.println("Account registered successfully!");
                            } else {
                                System.out.println("Maximum number of accounts reached.");
                            }
                            break;

                        case 2:
                            if (registeredAccounts > 0) {
                                System.out.print("Enter Account No.: ");
                                int account = sc.nextInt();
                                System.out.print("Enter Pin No.: ");
                                int pin = sc.nextInt();

                                bankingSystem loggedInAccount = null;
                                for (int i = 0; i < registeredAccounts; i++) {
                                    if (bc[i].verifyAccount(account, pin)) {
                                        loggedInAccount = bc[i];
                                        break;
                                    }
                                }
                                
                                if (loggedInAccount != null) {
                                    System.out.println("LOGIN SUCCESS");
                                    System.out.println("1. View Account Info");
                                    System.out.println("2. Deposit Money");
                                    System.out.println("3. Withdraw Money");
                                    System.out.println("4. Exit");
                                    
                                    System.out.print("Enter your banking choice: ");
                                    int bankingChoice = sc.nextInt();

                                    switch (bankingChoice) {
                                        case 1:
                                            System.out.println("Account No.: " + loggedInAccount.getAccNo());
                                            System.out.println("Balance: " + loggedInAccount.getBalance());
                                            break;
                                        case 2:
                                            System.out.print("Enter amount to deposit: ");
                                            float depositAmount = sc.nextFloat();
                                            loggedInAccount.deposit(depositAmount);
                                            break;
                                        case 3:
                                            
                                            break;
                                        case 4:
                                            System.out.println("Logging out...");
                                            break;
                                        default:
                                            System.out.println("Invalid banking choice.");
                                            break;
                                    }

                                } else {
                                    System.out.println("Invalid Account or Pin.");
                                }
                            } else {
                                System.out.println("No accounts have been registered yet.");
                            }
                            break;

                        case 3:
                            if (registeredAccounts > 0) {
                                for (int i = 0; i < registeredAccounts; i++) {
                                    System.out.println("Account " + (i + 1) + ": " + bc[i].getAccNo() + ", Balance: " + bc[i].getBalance());
                                }
                            } else {
                                System.out.println("No accounts to display.");
                            }
                            break;

                        default:
                            System.out.println("INVALID ACTION!");
                            break;
                    }

                    System.out.print("Continue? (1/0): ");
                    response = sc.nextInt();

                } while (response == 1);
                break;

            case 2:
                break;

            case 3:
                break;

            default:
                System.out.println("INVALID SELECTION!");
                break;
        }
    }
}