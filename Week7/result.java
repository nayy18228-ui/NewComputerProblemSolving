void main() {
    IO.print("Enter first number: ");
    int num1 = Integer.parseInt(IO.readln());
    IO.print("Enter second number: ");
    int num2 = Integer.parseInt(IO.readln());
    int result;
    if (num1 > num2) {
        result = num1 - num2;

    } else {
        result = num1 + num2;
    }
    IO.println("Result: " + result);
}