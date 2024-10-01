package lombok;

//@Builder
public class PhoneBuilder {

    private String os;
    private double ram;
    private double screensize;
    private double battery;
    private double cost;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(double ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreensize(double screensize) {
        this.screensize = screensize;
        return this;
    }

    public PhoneBuilder setBattery(double battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public Shop getPhone() {
        return new Shop(os, ram, screensize, battery, cost);
    }
}
