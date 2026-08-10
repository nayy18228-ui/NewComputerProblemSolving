void main() {
       IO.print("Enter number of box: ");
       int box = Integer.parseInt(IO.readln());

        IO.print("Enter number of pencils per box: ");
        int pencilPerBox = Integer.parseInt(IO.readln());

        int total = box * pencilPerBox;

        IO.println("Total number of pencils = " + total + " pieces");
}
