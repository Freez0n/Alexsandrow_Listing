package listing_3;

class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }

    int getMaxSpeed() {
        return this.maxspeed;
    }

    int getWheels() {
        return this.wheels;
    }

    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число колес");
            return;
        }
        this.wheels = wheels;
    }
    Vehicle() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    public String toString() {
        return "Vehicle(passengers=" + passengers + ";" + "wheels=" + wheels + ";" + "maxspeed=" + maxspeed + ";" + "burnup=" + burnup + ")";
    }
}
class Auto extends Vehicle {
    boolean sunroof;

    Auto(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    }
    Auto(int f, int g, int h, int j, boolean sunroof) {
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}
class PolyVehicleDemo{
    public static void main(String[] args){
        Auto a = new Auto(true);
        Vehicle v = new Vehicle();
        Vehicle[] pvd = {a , v};

        for (int i = 0; i < pvd.length; i++) {
            System.out.println(pvd[i].toString());
        }
    }
}
