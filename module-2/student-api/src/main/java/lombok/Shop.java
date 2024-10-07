package lombok;


public class Shop {

    private String os;
    private double ram;
    private double screensize;
    private double battery;
    private double cost;

    public Shop(String os, double ram, double screensize, double battery, double cost) {
        this.os = os;
        this.ram = ram;
        this.screensize = screensize;
        this.battery = battery;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", screensize=" + screensize +
                ", battery=" + battery +
                ", cost=" + cost +
                '}';
    }


}

