void main() {
    int pin = Integer.parseInt(IO.readln("Setting your PIN : "));
    double balance = Double.parseDouble(IO.readln("Enter the remaining amount : "));
    int userPin = Integer.parseInt(IO.readln("Enter your PIN : "));
    if (userPin == pin) {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");
        int choice = Integer.parseInt(IO.readln("Select an option: "));
        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            IO.println("Invalid option.");
        } else if (choice == 1) {
            IO.println("Your balance is " + balance + " baht.");
        } else if (choice == 2) {
            double withdraw = Double.parseDouble(IO.readln("Enter the withdrawal amount: "));
            if (withdraw <= 0) {
                IO.println("The amount must be greater than 0.");
            } else if (withdraw > balance) {
                IO.println("Insufficient funds.");
            } else {
                balance = balance - withdraw;
                IO.println("Withdrawal successful.");
                IO.println("Remaining balance: " + balance + " baht.");
            }
        } else if (choice == 3) {
            double deposit = Double.parseDouble(IO.readln("Enter the deposit amount: "));
            if (deposit > 0) {
                balance = balance + deposit;
                IO.println("Deposit successful.");
                IO.println("Update balance: " + balance + " baht.");
            } else {
                IO.println("The amount must be greater than 0.");
            }
        } else {
            IO.println("Thank you for using the ATM.");
        }
    } else {
        IO.println("Incorrect PIN.");
    }
}