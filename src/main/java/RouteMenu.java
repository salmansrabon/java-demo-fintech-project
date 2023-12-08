import admin.CreateUser;
import admin.DeleteUser;
import agent.Deposit;
import common.CheckBalance;
import common.CheckStatement;

import java.util.Scanner;

public class RouteMenu {
    Scanner scanner=new Scanner(System.in);
    public void getMenu(String role){
        if(role.equals("admin")){
            System.out.println("1. Create user");
            System.out.println("2. Delete user");

            int number;
            do {
                System.out.println("Choose a number what you want to do or press 0 for quit");
                number = scanner.nextInt();
                switch (number) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        CreateUser.createUser();
                        break;
                    case 2:
                        DeleteUser.deleteUser();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter valid number");

                }

            }
            while (true);

        }
        else if(role.equals("agent")){
            System.out.println("1. agent.Deposit");
            System.out.println("2. Check balance");
            System.out.println("3. Check statement");

            int number;
            do {
                System.out.println("Choose a number what you want to do or press 0 for quit");
                number = scanner.nextInt();
                switch (number) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        Deposit.deposit();
                        break;
                    case 2:
                        CheckBalance.checkBalance();
                        break;
                    case 3:
                        CheckStatement.checkStatement();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter valid number");

                }

            }
            while (true);
        }

    }

}

