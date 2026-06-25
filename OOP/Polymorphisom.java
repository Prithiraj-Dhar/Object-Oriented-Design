// compile time polymorphisom or function overloading

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}

public class Polymorphisom {

    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 10);
        double sum2 = math.add(3.5, 7.2);
        String result = math.add("Hello, ", "World!");

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated string: " + result);
    }
}

// run time polymorphisom or function overriding
class Animal {

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Polymorphisom {

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound(); // Dog's sound() method is called
        animal2.sound(); // Cat's sound() method is called
    }
}