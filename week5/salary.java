void main() {
    IO.println("Enter salary: ");
    double salary = Double.parseDouble(IO.readln());
    IO.print("Enter deduction percent: ");
    double deductionPercent = Double.parseDouble(IO.readln());
    double deduction = salary * deductionPercent / 100.0;
    double netSalary = salary - deduction;
    IO.println("Deduction = " + deduction + " baht");
    IO.println("Net salary = " + netSalary + " baht");
}