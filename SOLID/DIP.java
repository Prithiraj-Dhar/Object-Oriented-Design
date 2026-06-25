// Dependency Inversion Principle -> It states that high level module should not depend on low level modules, both should not depend on Abstraction

// violation of DIP -> modifying lightbulb class's method or replacing another devices like a fan require altering the switch classes code.

class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is on.");
    }
    public void turnOff() {
        System.out.println("LightBulb is off.");
    }
}
class Switch {
    private LightBulb bulb;
    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }
    public void operate() {
        bulb.turnOn();
    }
}

// Apply DIP
interface Switchable {
    void turnOn();
    void turnOff();
}
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is on.");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb is off.");
    }
}
class Switch {
    private Switchable device;
    public Switch(Switchable device) {
        this.device = device;
    }
    public void operate() {
        device.turnOn();
    }
}