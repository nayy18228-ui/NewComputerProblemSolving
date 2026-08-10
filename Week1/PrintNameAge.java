void main() {
        IO.print("Enter your name: ");
        String name = IO.readln();

        IO.print("Enter your age: ");
        int age = Integer.parseInt(IO.readln());

        IO.println("Hello, " + name + ". You are " + age + " years old...");
    }