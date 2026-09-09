void main() {
    IO.print("Enter your Age:");
    int age = Integer.parseInt(IO.readln());
    // IO.println("Your age : + age");
    if ((age < 59) || (age > 100)) {
        IO.print("Error");
    } else if (age <= 0) {
        IO.print("Your Error");
    } else if (age >= 9) {
        IO.print(" Your Age Child");
    } else if (age <= 19) {
        IO.print(" Your Age Adult ");
    } else if (age <= 59) {
        IO.print("Your Age Teenager ");
    } else {
        IO.print("Your Age Child");
    }

}