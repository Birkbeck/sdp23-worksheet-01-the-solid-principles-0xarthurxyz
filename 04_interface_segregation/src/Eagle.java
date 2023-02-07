public class Eagle extends Bird implements FlyingAnimal, MoltingAnimal {
    // Attribute(s)
    String currentLocation;
    int numberOfFeathers;
    
    // Constructor
    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    // Interface methods
    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
