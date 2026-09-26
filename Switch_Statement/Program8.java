/*8).Write a Java program to create an ATM menu using switch:
1 → Check Balance
2 → Deposit
3 → Withdraw
4 → Exit
*/
import java.util.Scanner;

class Program8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double balance = 50000;
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            choice = s.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.println("Enter deposit amount:");
                    double deposit = s.nextDouble();

                    balance = balance + deposit;

                    System.out.println("Amount Deposited = ₹" + deposit);
                    System.out.println("Updated Balance = ₹" + balance);
                    break;

                case 3:
					System.out.println("Available balance is "+balance);
                    System.out.println("Enter withdrawal amount:");
				
                    double withdraw = s.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
						
                        System.out.println("Amount Withdrawn = ₹" + withdraw);
                        System.out.println("Remaining Balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}