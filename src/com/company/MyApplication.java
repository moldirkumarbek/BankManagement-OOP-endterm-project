package com.company;
//import a paths to the classes

import com.company.controllers.AccountController;
import com.company.controllers.BankController;
import com.company.controllers.CustomerController;
import com.company.controllers.DepositController;
import com.company.repositories.interfaces.IAccountRepository;
import com.company.repositories.interfaces.IBankRepository;
import com.company.repositories.interfaces.ICustomerRepository;
import com.company.repositories.interfaces.IDepositRepository;

import java.util.Scanner;

public class MyApplication {
    private final BankController controller;
    private final AccountController controller1;
    private final CustomerController controller2;
    private final DepositController controller3;
    private final Scanner scanner;

    /**
     * Overloaded constructor with default parameter values
     */
    public MyApplication(IBankRepository repo, ICustomerRepository repo1, IAccountRepository repo2, IDepositRepository repo3) {
        controller = new BankController(repo);
        controller1 = new AccountController(repo2);
        controller2 = new CustomerController(repo1);
        controller3= new DepositController(repo3);

        scanner = new Scanner(System.in);
    }

    /**
     * Method start is used to start program execution
     */
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to Online Bank");
            System.out.println("Please select a funciton:");
            System.out.println("1. Select a Bank");
            System.out.println("2. Information about customers");
            System.out.println("3. Information about accounts");
            System.out.println("4. Information about deposits");
            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.print("Enter option (1-3): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    bankMenu();
                } else if (option == 3) {
                    AccountMenu();
                } else if (option == 2) {
                    CustomerMenu();
                } else if (option == 4) {
                    DepositMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }
        }
    }

    /**
     * Method bankMenu, which returns the top level menu
     */
    private void bankMenu() {
        while (true) {
            System.out.println("Welcome to Application");
            System.out.println("Select option:");
            System.out.println("1. Get all banks");
            System.out.println("2. Get bank by id");
            //System.out.println("3. Create bank");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllBanksMenu();
                } else if (option == 2) {
                    getBankByIdMenu();
                } else if (option == 3) {
                    createBankMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method AccountMenu, which returns the middle level menu
     */
    private void AccountMenu() {
        while (true) {
            System.out.println("Welcome to Application");
            System.out.println("Select option:");
            System.out.println("1. Get all accounts");
            System.out.println("2. Get account by customer id");
           // System.out.println("3. Create account");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllAccountsMenu();
                } else if (option == 2) {
                    getAccountsByIdMenu();
                } else if (option == 3) {
                    createAccountMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method CustomerMenu, which returns the low level menu
     */
    private void CustomerMenu() {
        while (true) {
            System.out.println("Welcome to Application");
            System.out.println("Select option:");
            System.out.println("1. Get all customers");
            System.out.println("2. Get customer by bank id");
           // System.out.println("3. Create customer");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllCustomersMenu();
                } else if (option == 2) {
                    getCustomerByIdMenu();
                } else if (option == 3) {
                    createCustomerMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method CustomerMenu, which returns the low level menu
     */
    private void DepositMenu() {
        while (true) {
            System.out.println("Welcome to Application");
            System.out.println("Select option:");
            System.out.println("1. Get all deposits");
            System.out.println("2. Get deposit by account id");
            // System.out.println("3. Create customer");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllDepositsMenu();
                } else if (option == 2) {
                    getDepositsByIdMenu();
                } else if (option == 3) {
                    createCustomerMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    /**
     * Method, which returns all top level employees
     */
    public void getAllBanksMenu() {
        String response = controller.getAllBanks();
        System.out.println(response);
    }

    /**
     * Method, which returns top level employee by id
     */
    public void getBankByIdMenu() {
        System.out.println("Please enter bank id");

        int bank_id = scanner.nextInt();
        String response = controller.getBank(bank_id);
        System.out.println(response);
    }
    /**
     * Method, which  create top level employee
     */
    public void createBankMenu() {
        System.out.println("Please enter a bank name");
        String name = scanner.next();
        System.out.println("Please enter a bank address");
        String address = scanner.next();
        System.out.println("Please enter a bank city");
        String city = scanner.next();

        String response = controller.createBank(name, address, city);
        System.out.println(response);
    }

    /**
     * Method, which returns all middle level employees
     */
    public void getAllAccountsMenu() {
        String response = controller1.getAllAccounts();
        System.out.println(response);
    }
    /**
     * Method, which returns middle level employee by id
     */
    public void getAccountsByIdMenu() {
        System.out.println("Please enter customer id");

        int account_id = scanner.nextInt();
        String response = controller1.getAccount(account_id);
        System.out.println(response);
    }
    /**
     * Method, which  create middle level employee
     */
    public void createAccountMenu() {
        System.out.println("Please enter Account's customer id");
        int customer = scanner.nextInt();
        System.out.println("Please enter Account's bill");
        String type = scanner.next();

        String response = controller1.createAccount(customer, type);
        System.out.println(response);
    }
    /**
     * Method, which returns all middle level employees
     */
    public void getAllDepositsMenu() {
        String response = controller3.getAllDeposits();
        System.out.println(response);
    }
    /**
     * Method, which returns middle level employee by id
     */
    public void getDepositsByIdMenu() {
        System.out.println("Please enter account id");

        int id = scanner.nextInt();
        String response = controller3.getDeposit(id);
        System.out.println(response);
    }
    /**
     * Method, which  create middle level employee
     */

    /**public void createDepositMenu() {
        System.out.println("Please enter Account's id");
        String account = scanner.next();
        System.out.println("Please enter deposit amount");
        String type = scanner.next();

        String response = controller3.createDeposit(customer, type);
        System.out.println(response);
    */

    /**
     * Method, which returns all low level employees
     */
    public void getAllCustomersMenu() {
        String response = controller2.getAllCustomers();
        System.out.println(response);
    }
    /**
     * Method, which  low level employee by id
     */
    public void getCustomerByIdMenu() {
        System.out.println("Please enter bank id");

        int customer_id = scanner.nextInt();
        String response = controller2.getCustomer(customer_id);
        System.out.println(response);
    }
    /**
     * Method, which  create low level employee
     */
    public void createCustomerMenu() {
        System.out.println("Please enter employee's bank id");
        int bid = scanner.nextInt();
        System.out.println("Please enter employee's name");
        String name = scanner.next();
        System.out.println("Please enter employee's surname");
        String surname = scanner.next();
        System.out.println("Please enter employee's gender (male/female/Raketenjagdpanzer 2)");
        String gender = scanner.next();
        System.out.println("Please enter employee's telephone");
        String telephone = scanner.next();
        System.out.println("Please enter employee's address");
        String address = scanner.next();

        String response = controller2.createCustomer(bid, name, surname, gender, telephone, address);
        System.out.println(response);
    }
}