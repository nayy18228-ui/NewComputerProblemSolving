void main() {
    IO.print("Enter initial saving: ");
    double initialSaving = Double.parseDouble(IO.readln());
    IO.print("Enter monthly saving: ");
    double monthlySaving = Double.parseDouble(IO.readln());
    IO.print("Enter number of months:  ");
    double months = Double.parseDouble(IO.readln());
    IO.print("Enter interest percent: ");
    double interestPercent = Double.parseDouble(IO.readln());
    double totalSaving = initialSaving + (monthlySaving * months);
    double interest = (totalSaving * interestPercent) / 100;
    double finalSaving = totalSaving + interest;
    System.out.printf("Total saving before interest = %.2f baht\n", totalSaving);
    System.out.printf("Interest = %.2f baht\n", interest);
    System.out.printf("Final saving = %.2f baht\n", finalSaving);

}
