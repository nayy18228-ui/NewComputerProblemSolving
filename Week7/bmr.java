void main() {
    IO.print("Enter gender (male/female): ");
    String gender = IO.readln();

    IO.print("Enter weight (kg): ");
    double weight = Double.parseDouble(IO.readln());

    IO.print("Enter height (cm): ");
    double height = Double.parseDouble(IO.readln());

    IO.print("Enter age (years): ");
    int age = Integer.parseInt(IO.readln());

    double bmr = 0;

    if (gender.equalsIgnoreCase("male")) {
        bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
    } else {
        bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
    }

    IO.println("Your BMR is: " + bmr);
}
