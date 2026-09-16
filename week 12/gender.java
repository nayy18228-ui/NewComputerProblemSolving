void main() {
    int age = Integer.parseInt(IO.readln("Enter your age: "));
    String gender = IO.readln("Enter your gender (M/F): ");
    String group;
    if (age > 15) {
        if (gender.equalsIgnoreCase("F")) {
            group = "woman";
        } else {
            group = "man";
        }
    } else {
        if (gender.equalsIgnoreCase("F")) {
            group = "girl";
        } else {
            group = "boy";
        }
    }

    IO.println("Your group is " + group + ".");

}