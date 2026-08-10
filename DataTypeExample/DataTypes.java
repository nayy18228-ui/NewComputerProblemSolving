void main() {
    // 1. byte: จำนวนเต็มขนาดเล็ก
    byte age = 20;
    byte temperature = -5;

    // 2. short: จำนวนเต็มขนาดกลาง
    short studentCount = 1200;
    short year = 2026;

    // 3. int: จำนวนเต็มที่ใช้บ่อยที่สุด
    int score = 85;
    int population = 500000;

    // 4. long: จำนวนเต็มขนาดใหญ่มาก ต้องใส่ L ต่อท้าย
    long worldPopulation = 8000000000L;
    long maxLong = 9223372036854775807L;

    // 5. float: ทศนิยม ต้องใส่ f ต่อท้าย
    float price = 19.99f;
    float weight = 45.5f;

    // 6. double: ทศนิยมที่ใช้บ่อยกว่า float
    double pi = 3.141592653589793;
    double area = 78.53975;

    // 7. char: ตัวอักษร 1 ตัว ใช้เครื่องหมาย ' '
    char grade = 'A';

    // 8. boolean: ค่าจริงหรือเท็จ
    boolean isPass = true;
    boolean isLate = false;

    IO.println("Data Type Examples:");
    IO.println("age = " + age);
    IO.println("temperature = " + temperature);
    IO.println("studentCount = " + studentCount);
    IO.println("year = " + year);
    IO.println("score = " + score);
    IO.println("population = " + population);
    IO.println("worldPopulation = " + worldPopulation);
    IO.println("maxLong = " + maxLong);
    IO.println("price = " + price);
    IO.println("weight = " + weight);
    IO.println("pi = " + pi);
    IO.println("area = " + area);
    IO.println("grade = " + grade);
    IO.println("isPass = " + isPass);
    IO.println("isLate = " + isLate);
}