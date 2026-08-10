void main() {
    IO.print("Enter width: ");
    Double width = Double.parseDouble(IO.readln());
    IO.print("Enter length: ");
    Double length = Double.parseDouble(IO.readln());
    double bsa = (width * length) / 360.0;
    System.out.println("Body Surface Area (BSA) = " + bsa);
}