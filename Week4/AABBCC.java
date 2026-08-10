void main() {
    IO.print("Enter salary: ");

    double salary = Double.parseDouble(IO.readln());
    double Tax = Salary * 0.1;

    IO.println("Tax =" + Tax);
}