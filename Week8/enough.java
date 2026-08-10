void main() {
    IO.print("Enter your product Price:     ");
    int price = Integer.parseInt(IO.readln());

    IO.print("Enter your quantity: ");
    int quantity = Integer.parseInt(IO.readln());

    IO.print("Enter  cash: ");
    int cash = Integer.parseInt(IO.readln());

    int total = price * quantity;

    if (cash >= total) {
        int change = cash - total;
        IO.println("change = " + change);
    } else
        IO.println("not enough money");
}