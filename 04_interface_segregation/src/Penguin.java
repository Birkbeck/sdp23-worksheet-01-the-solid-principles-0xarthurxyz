public class Penguin extends Bird implements SwimmingAnimal, MoltingAnimal {
    // Attribute(s)
    String currentLocation;
    int numberOfFeathers;

    // Constructor
    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    // Interface methods
    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }

    // Methods
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
