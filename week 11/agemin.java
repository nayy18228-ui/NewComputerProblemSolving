void main() {
    IO.print("Enter your Age:");
    int age = Integer.parseInt(IO.readln());
    // IO.println("Your age : + age");

    if (age <= 60) {
        IO.print("Senior");
    } else if (age >= 19) {
        IO.print("Adult");
    } else if (age >= 9) {
        IO.print("child");
    } else if (age <= 0) {
        IO.print("Your Error");
    }
}