package agent;

import common.Actions;

import java.util.Scanner;

public class AgentUser {
    public AgentUser(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Agent Deposit");
        System.out.println("2. Check balance");
        System.out.println("3. Check statement");
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
                    Deposit agent=new Deposit();
                    agent.deposit();
                    break;
                case 2:
                    Actions balanceObj=new Actions();
                    balanceObj.checkBalance();
                    break;
                case 3:
                    Actions statementObj=new Actions();
                    statementObj.checkStatement();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter valid number");

            }

        }
        while (true);
    }
}
