void main() {
    IO.print("Enter your grade:");
    int grade = Integer.parseInt(IO.readln());
    if ((grade > 0) && (grade > 100)) {
        IO.print("You must enter a correct score, try again later.");

    } else if (grade >= 80) {
        IO.print("Your grade is A");
    } else if (grade >= 70) {
        IO.print("Your grade is B ");
    } else if (grade >= 60) {
        IO.print("Your grade is C");
    } else if (grade >= 50) {
        IO.print("Your grade is D");
    } else {
        IO.print("Your grade is F");
    }
}