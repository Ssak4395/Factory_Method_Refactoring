public class ElectricCar implements  Vehicle{

    /*
    I think you can refactor this class further by making it extends Car class, since a electric car is technically still a car
    but with withs own unique methods.

     */
    //extends Car implements Vehicle{
    private final String colour;
    private final int numPassengers;

    public ElectricCar(int numPassengers, String colour){
      //  super(numPassengers,colour);
        this.numPassengers = numPassengers;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "This is a " + colour + " electric car that can seat " + numPassengers + " passengers.";
    }
}
