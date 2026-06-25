// Liskov Substitution principle (LSP) 

// violations of LSP -> ostrich extends bird but it`s can`t fly
class Bird {
    public void fly() {
        System.out.println("Flying in the sky.");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly.");
    }
}

// Apply LSP
class Bird {
    public void move() {
        System.out.println("Bird is moving");
    }
}
class Eagle extends Bird {
    @Override
    public void move() {
        System.out.println("Eagle is flying");
    }
}
class Ostrich extends Bird {
    @Override
    public void move() {
        System.out.println("Ostrich is running");
    }
}
