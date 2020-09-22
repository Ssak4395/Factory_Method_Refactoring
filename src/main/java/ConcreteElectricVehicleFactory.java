public class ConcreteElectricVehicleFactory implements ElectricVehicleFactory {

    @Override
    public Vehicle returnConcreteVehicle(String type, String colour, int seats) {
        Vehicle vehicle;
        switch (type){
            case "Car":
                vehicle = new ElectricCar(seats,colour);
                return vehicle;
            default:
                return  null;
        }
    }

    @Override
    public Vehicle returnConcreteVehicle(String type, String colour) {
        Vehicle vehicle;
        switch (type){
            case "Car":
                vehicle = new Scooter(colour);
                return vehicle;
            default:
                return  null;
        }
    }
}
