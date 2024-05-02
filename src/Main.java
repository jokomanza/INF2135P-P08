import engine.Engine;
import engine.Stroke;
import vehicle.Car;
import vehicle.MotorCycle;

/**
 * Main class to test the implementation of the classes
 */
public class Main {

    /**
     * Main method to test the implementation of the classes
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create a Stroke object named twoStroke with the value TWO_STROKE
        Stroke twoStroke = Stroke.TWO_STROKE;
        // Create a Stroke object named fourStroke with the value FOUR_STROKE
        Stroke fourStroke = Stroke.FOUR_STROKE;


        // Create an Engine object named twoStrokeEngine with the following parameters:
        // cylinders: 2
        // capacity: 500
        // stroke: twoStroke
        Engine twoStrokeEngine = new Engine(2, 500, twoStroke);


        // Create an Engine object named fourStrokeEngine with the following parameters:
        // cylinders: 4
        // capacity: 1000
        // stroke: fourStroke
        Engine fourStrokeEngine = new Engine(4, 1000, fourStroke);


        // Create a MotorCycle object named motorCycle with the following parameters:
        // fuels: 2
        // engine: twoStrokeEngine
        MotorCycle motorCycle = new MotorCycle(2, twoStrokeEngine);


        // Create a Car object named car with the following parameters:
        // fuels: 4
        // engine: fourStrokeEngine
        Car car = new Car(4, fourStrokeEngine);


        // Print the following message:
        // MotorCycle with 2 fuels has a 2-cylinder engine with a capacity of 500 cc and a two-stroke stroke
        System.out.println("MotorCycle with " + motorCycle.getFuelsCapacity() + " fuels has a " + motorCycle.getEngine().getCylinders() + "-cylinder engine with a capacity of " + motorCycle.getEngine().getCapacity() + " cc and a " + motorCycle.getEngine().getStroke() + " stroke");
        // Print the following message:
        // Car with 4 fuels has a 4-cylinder engine with a capacity of 1000 cc and a four-stroke stroke
        System.out.println("Car with " + car.getFuelsCapacity() + " fuels has a " + car.getEngine().getCylinders() + "-cylinder engine with a capacity of " + car.getEngine().getCapacity() + " cc and a " + car.getEngine().getStroke() + " stroke");
    }
}
