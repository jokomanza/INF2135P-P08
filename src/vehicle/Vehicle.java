package vehicle;

public abstract class Vehicle {
    /**
     * The number of fuels the car can hold (in liters)
     */
    private final float fuelsCapacity;
    private final engine.Engine engine;

    public Vehicle(float fuelsCapacity, engine.Engine engine) {
        this.fuelsCapacity = fuelsCapacity;
        this.engine = engine;
    }

    public float getFuelsCapacity() {
        return fuelsCapacity;
    }

    public engine.Engine getEngine() {
        return engine;
    }
}
