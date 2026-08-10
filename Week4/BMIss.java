void main() {
    IO.print("Enter weight : ");
    double weight = Double.parseDouble(IO.readln());

    IO.print("Enter height : ");
    double height = Double.parseDouble(IO.readln());
    ;

    double BMI = weight / (height * height);

    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, BMI));
}