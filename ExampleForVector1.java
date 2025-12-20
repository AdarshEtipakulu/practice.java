import java.util.Vector;
class Car {
    String name;
    String colour;
    public Car(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public String toString() {
        return "Car{name='" + name + "', colour='" + colour + "'}";
    }
}

public class ExampleForVector1 {
    public static void main(String[] args) {
        // Create a Vector to hold Car objects
        Vector<Car> carVector = new Vector<>();
        carVector.add(new Car("BMW", "Yellow"));
        carVector.add(new Car("Benz", "White"));
        System.out.println("Full List: " + carVector);
        System.out.println("____________");
        System.out.println(carVector.get(1));
        System.out.println( carVector.isEmpty());
        System.out.println( carVector.size());
        for (Car c : carVector) {
            System.out.println(c.getName() + " is " + c.getColour());
        }
    }
}
