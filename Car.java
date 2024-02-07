public class Car {
    private int yearModel;
    private String make;
    private int speed;
    static final int maxSpeed = 180;
    static final int minSpeed = 0;

    Car() {
        yearModel = 0000;
        make = " ";
        speed = minSpeed;
    }

    Car(int year, String make) {
        yearModel = year;
        this.make = make;
        speed = minSpeed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (speed == maxSpeed) {
            return;
        } else {
            speed += 5;
        }
    }

    public void brake() {
        if (speed == minSpeed) {
            return;
        } else {
            speed -= 5;
        }
    }

    @Override
    public String toString() {
        return String.format("%4d   %-20s    %3d", yearModel, make, speed);
    }
}
