import java.util.Scanner;




 public class task {
 
  public static void main(String[] args) {
 
         int balance = 0, withdraw, deposite;
 
         @SuppressWarnings("resource")
 
          Scanner sc = new Scanner(System.in);
 
 
 
        while (true) {
 
             System.out.println("**ATM Machine**\n");
 
              System.out.println("choose 1 for Withdraw");
 
              System.out.println("Choose 2 for deposite");
  System.out.println("Choose 3 for current balance");
 
             System.out.println(" Choose 4 for Exit");
 
              System.out.println("Choose the Operation");
 
               int choice = sc.nextInt();
 
               switch (choice) {
 
               case 1:
 
                    System.out.println("Enter Amount to withdraw  :");
 
                      withdraw = sc.nextInt();
 
 
                 
                     if (balance >= withdraw) {
 
                          balance = balance - withdraw;
 
                          System.out.println("Kindley collect your Amount");
 
                     } else {
 
                         System.out.println("Insufficient Balance");
 
                     }
    
 
                     System.out.println("");
 
                     break;
 
 
 
                 case 2:
 
                      System.out.println("Enter amount to be deposited:  ");
 
                     deposite = sc.nextInt();
 
 
 
                     balance = balance + deposite;
 
                     System.out.println("Your amount is deposited: ");
 
                     System.out.println("");
 
                     break;
 
 
 
                 case 3:
 
                     System.out.println("Current balance :  " + balance);
                          break;
 
 
 
                  case 4:
 
                     System.exit(0);
 
             }
        }
 
         }
 
     }
