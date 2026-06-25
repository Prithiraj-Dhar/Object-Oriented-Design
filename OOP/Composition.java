interface BarkBehavior {
    void bark();
}

class DogBark implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Woof!");
    }
}

class RobotBark implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Beep!");
    }
}

class Dog {
    private BarkBehavior barkBehavior;

    public Dog(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void bark() {
        barkBehavior.bark();
    }
}

class RobotDog {
    private BarkBehavior barkBehavior;

    public RobotDog(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void bark() {
        barkBehavior.bark();
    }
}

public class Composition {
    public static void main(String[] args) {
        Dog dog = new Dog(new DogBark());
        RobotDog robotDog = new RobotDog(new RobotBark());

        dog.bark();      // Output: Woof!
        robotDog.bark(); // Output: Beep!
    }
}