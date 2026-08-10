
void main() {
    IO.print("Enter temperature in Fahrenheit: ");
    Double Fahrenheit = Double.parseDouble(IO.readln());

    double Celsius = (5.0 / 9.0) * (Fahrenheit - 32);
    IO.println("%.2f Fahrenheit is equal to %.2f Celsius%n".formatted(Fahrenheit, Celsius));
}