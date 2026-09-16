void main() {
    int pin = 1234;
    int balance = 1000;

    int usepin = Integer.parseInt(IO.readln("setting your usepin: "));

    if (usepin == pin) {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");

        int choice = Integer.parseInt(IO.readln("Enter choice: "));

        if (choice == 1) {
            IO.println("Your balance " + balance + " bath");
        } else if (choice == 2) {
            IO.println(" Withdraw money");
            int withdraw = Integer.parseInt(IO.readln("Enter your withdraw: "));

            if (withdraw > 0 && withdraw <= balance) {
                balance = balance - withdraw;
                IO.println("Withdrawal successful.");
                IO.println("Remaining balance: " + balance + " bath");
            } else {
                IO.println("Invalid amount or insufficient balance.");
            }
        } else if (choice == 3) {
            int deposit = Integer.parseInt(IO.readln("Enter deposit amount: "));
            if (deposit > 0) {
                balance = balance + deposit;
                IO.println("Deposit successful.");
                IO.println("New balance: " + balance + " bath");
            } else {
                IO.println("The amount must be greater than 0.");
            }
        } else if (choice == 4) {
            IO.println("Thank you for using the ATM.");
        } else {
            IO.println("Invalid option.");
        }
    } else {
        IO.println("Incorrect PIN.");
    }
}