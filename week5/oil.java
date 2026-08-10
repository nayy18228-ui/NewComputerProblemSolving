void main() {
    IO.print("Enter distance (km): ");
    double distance = Double.parseDouble(IO.readln());
    IO.print("Enter fuel efficiency (km/liter): ");
    double fuelefficiency = Double.parseDouble(IO.readln());
    IO.print("Enter fuel price per liter: ");
    double fuelPrice = Double.parseDouble(IO.readln());
    double fuelUsed = distance / fuelefficiency;
    double totalCost = fuelUsed * fuelPrice;
    IO.println("Fuel used = " + fuelUsed + " liters");
    IO.println("Total cost = " + totalCost + " baht");

}