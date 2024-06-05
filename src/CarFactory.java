public class CarFactory {
    protected int wheels;
    protected int engineVersion;

    public CarFactory(int wheels, int engineVersion) {
        this.wheels = wheels;
        this.engineVersion = engineVersion;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(int engineVersion) {
        this.engineVersion = engineVersion;
    }
}
