void main() {

    IO.print("Enter number 1: ");
    double num1 = Double.parseDouble(IO.readln());

    IO.print("Enter number 2: ");
    double num2 = Double.parseDouble(IO.readln());

    IO.print("Enter number 3: ");
    double num3 = Double.parseDouble(IO.readln());

    IO.print("Enter number 4: ");
    double num4 = Double.parseDouble(IO.readln());

    IO.print("Enter number 5: ");
    double num5 = Double.parseDouble(IO.readln());

    double sum = num1 + num2 + num3 + num4 + num5;
    double average = sum / 5;

    IO.println("Sum = " + sum);
    IO.print("Average = " + average);

}