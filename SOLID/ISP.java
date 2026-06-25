// Interface Segregation Principle (ISP) -> this states that client should not be forced to depend on interfaces they don't use

// violatio of ISP
interface Worker {
    void work();
    void eat();
    void sleep();
}
class Robot implements Worker {
    public void work() {
        System.out.println("Performing tasks like welding.");
    }
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat.");
    }
    public void sleep() {
        throw new UnsupportedOperationException("Robots don't sleep.");
    }
}
class Human implements Worker {
    public void work() {
        System.out.println("Performing tasks like coding.");
    }
    public void eat() {
        System.out.println("Eating a meal.");
    }
    public void sleep() {
        System.out.println("Sleeping at night.");
    }
}


// Apply ISP
interface Workable {
    void work();
}
interface Eatable {
    void eat();
}
interface Sleepable {
    void sleep();
}
class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Performing tasks like welding.");
    }
}
class Human implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Performing tasks like coding.");
    }
    @Override
    public void eat() {
        System.out.println("Eating a meal.");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping at night.");
    }
}