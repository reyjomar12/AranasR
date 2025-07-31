package reyjomara;

import java.util.Scanner;
import banking.bankingSystem;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                bankingSystem bc = new bankingSystem();
                int attempts = 0;
                int maxAttempts = 3;

                while (attempts < maxAttempts) {
                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        break;
                    } else {
                        attempts++;
                        if (attempts < maxAttempts) {
                            System.out.println("Incorrect account number or PIN. Attempt " + attempts + " of " + maxAttempts);
                        } else {
                            System.out.println("Maximum attempts reached. Exiting system...");
                            System.exit(0);
                        }
                    }
                }
                break;

            case 2:
                break;

            case 3:
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}
