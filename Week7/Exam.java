void main() {
    IO.print("Enter your midterm score: ");
    int midterm = Integer.parseInt(IO.readln());

    IO.print("Enter your final score: ");
    int finalScore = Integer.parseInt(IO.readln());

    int total = midterm + finalScore;

    if (total >= 50) {
        IO.println("Your total score is " + total + " . The result is Pass!!");
    } else {
        IO.println("Your total score is " + total + " . The result is Fail!!");
    }
}
