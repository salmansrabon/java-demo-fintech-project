package admin;

import java.util.List;
import java.util.Scanner;

public class AdminUser {
    public AdminUser(){
        Actions user=new Actions();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Create user");
        System.out.println("2. Delete user");
        int number;
        do {
            System.out.println("Choose a number what you want to do or press 0 for quit");
            number = scanner.nextInt();
            switch (number) {
                case 0:
                    System.exit(0);
                    scanner.close();
                    break;
                case 1:
                    user=new Actions();
                    user.createUser();
                    break;
                case 2:
                    user=new Actions();
                    user.deleteUser();
                    break;
                case 3:
                    user=new Actions();
                    user.listUser();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter valid number");

            }

        }
        while (true);
    }
}
