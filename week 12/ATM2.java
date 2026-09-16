void main() {
    int correctPin = 1234;
    double balance = 10000.00;
    int pin = Integer.parseInt(IO.readln("Enter your PIN: "));
    if (pin == correctPin) {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");
        int option = Integer.parseInt(
                IO.readln("Select an option: "));
        switch (option) {
            case 1:
                IO.println("Your balance is " + balance + " baht.");
                break;
            case 2:
                double withdraw = Double.parseDouble(
                        IO.readln("Enter the withdrawal amount: "));
                if (withdraw <= 0) {
                    IO.println("The amount must be greater than 0.");
                } else if (withdraw <= balance) {
                    balance = balance - withdraw;
                    IO.println("Withdrawal successful.");
                    IO.println(
                            "Remaining balance: " + balance + " baht.");
                } else {
                    IO.println("Insufficient funds.");
                }
                break;
            case 3:
                double deposit = Double.parseDouble(
                        IO.readln("Enter the deposit amount: "));
                if (deposit > 0) {
                    balance = balance + deposit;
                    IO.println("Deposit successful.");
                    IO.println(
                            "Updated balance: " + balance + " baht.");
                } else {
                    IO.println("The amount must be greater than 0.");
                }
                break;
            case 4:
                IO.println("Thank you for using the ATM.");
                break;
            default:
                IO.println("Invalid option.");
        }
    } else {
        IO.println("Invalid PIN.");
    }
}