void main() {
    IO.print("Enter a number: ");
    int number = Integer.parseInt(IO.readln());

    if (number == 1) {
        IO.print("Enter the base of the triangle: ");
        double base = Double.parseDouble(IO.readln());

        IO.print("Enter the height of the triangle: ");
        double height = Double.parseDouble(IO.readln());

        double area = 0.5 * base * height;
        IO.println("Area of the triangle: " + area + " square units");

    } else if (number == 2) {
        IO.print("Enter your weight in kilograms: ");
        double weight = Double.parseDouble(IO.readln());

        IO.print("Enter your height in meters: ");
        double height = Double.parseDouble(IO.readln());

        double bmi = weight / (height * height);
        IO.println("Your BMI for weight = " + weight + " kg and height = " + height + " meters is: " + bmi + " bmi.");
    }
}
