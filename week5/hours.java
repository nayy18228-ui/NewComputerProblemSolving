
void main() {

    IO.print("Enter hours : ");

    double hourse = Double.parseDouble(IO.readln());

    IO.print("Enter minutes : ");

    double minutes = Double.parseDouble(IO.readln());

    double total = (hourse * 60) + minutes;

    IO.println("Total minutes = " + total + " minutes");
}
