void main() {
    IO.println("Enter score1: ");
    double score1 = Double.parseDouble(IO.readln());
    IO.println("Enter score2: ");
    double score2 = Double.parseDouble(IO.readln());
    IO.println("Enter score3: ");
    double score3 = Double.parseDouble(IO.readln());
    IO.println("Enter bonusscore: ");
    double bonus_score = Double.parseDouble(IO.readln());
    double totalscore = score1 + score2 + score3;
    double totalBonus = totalscore + bonus_score;
    double average = totalBonus / 3.0;
    IO.println("Total score = " + totalscore + " points");
    IO.println("Total with bonus = " + totalBonus + " points");
    System.out.printf("Average of totalWithBonus(%.0f) = %.2f points\n", totalBonus, average);
}