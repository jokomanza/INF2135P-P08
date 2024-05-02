package engine;

/**
 * Engine class to create an engine object
 */
public class Engine {

    private final int cylinders;
    private final int capacity;
    private final Stroke stroke;

    public Engine(int cylinders, int capacity, Stroke stroke) {
        this.cylinders = cylinders;
        this.capacity = capacity;
        this.stroke = stroke;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getCapacity() {
        return capacity;
    }

    public Stroke getStroke() {
        return stroke;
    }
}
