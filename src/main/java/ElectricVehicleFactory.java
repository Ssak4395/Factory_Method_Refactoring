public interface ElectricVehicleFactory {

    Vehicle returnConcreteVehicle(String type,String colour, int seats);

    //Method overloading.
    Vehicle returnConcreteVehicle(String type,String colour);

}
