public class Fridge extends Appliance {
    private double volume; // in cubic feet

    public Fridge(String name, double energyconsumed, double cost, int ecoRating, double volume) {
        super(name, energyconsumed, cost, ecoRating, "Fridge");
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Fridge{" + "Volume: " + volume + ", " + super.toString() + '}';
    }
}