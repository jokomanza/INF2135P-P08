package vehicle;

import engine.Engine;

/**
 * Car class to create a car object
 */
public class Car {
    /**
     * The number of fuels the car can hold (in liters)
     */
    private final float fuelsCapacity;
    private final Engine engine;

    public Car(float fuelsCapacity, Engine engine) {
        this.fuelsCapacity = fuelsCapacity;
        this.engine = engine;
    }

    public float getFuelsCapacity() {
        return fuelsCapacity;
    }

    public Engine getEngine() {
        return engine;
    }
}
